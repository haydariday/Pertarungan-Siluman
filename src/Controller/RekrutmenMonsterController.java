/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.*;
import Model.*;
import View.*;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
/**
 *
 * @author Deking
 */
public class RekrutmenMonsterController implements ActionListener{
    private AplikasiRekrutmenMonster app;
    private RekrutPecat frame;
    
    public RekrutmenMonsterController(){
        app = new AplikasiRekrutmenMonster();
        frame = new RekrutPecat();
        frame.getPerbaharuiBtn().addActionListener(this);
        frame.getPecatBtn().addActionListener(this);
        frame.getRekrutBtn().addActionListener(this);
        frame.getKembaliBtn().addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frame.getPerbaharuiBtn())){
            refreshTable(frame.getTableMonster(),frame.getTablePelatih(),app.getAllMonster(),app.GetAllPelatih());
        }if(ae.getSource().equals(frame.getPecatBtn())){
            pecatMonster(frame.getTablePelatih());
        }if(ae.getSource().equals(frame.getRekrutBtn())){
            rekrutMonster(frame.getTablePelatih(), frame.getTableMonster());
        }if(ae.getSource().equals(frame.getKembaliBtn())){
            frame.setVisible(false);
            new ViewPelatihController();
        }
    }
    public void refreshTable(JTable tableM,JTable tableP, ArrayList<Monster> monster, ArrayList<Pelatih> pelatih){
        tableM.clearSelection();
        tableP.clearSelection();
        int rowsM = tableM.getRowCount();
        int rowsP = tableP.getRowCount();
        int i = 0;
        int j = 0;
        for (i = rowsM - 1; i >= 0; i--) {
            for (j =0;j<6;j++){
                tableM.setValueAt("", i, j);
            }
        }
        i = 0;
        j = 0;
        for (i = rowsP - 1; i >= 0; i--) {
            for (j =0;j<4;j++){
                tableP.setValueAt("", i, j);
            }
        }
        i = 0;
        String tipe = "Monster";
        for (Monster m : monster) {
            try{
            if (m instanceof EarthElemental){
            tipe = "Bumi";
            }else if(m instanceof FireElemental){
            tipe = "Api";
            }else if (m instanceof WaterElemental){
            tipe = "Air";
            }
            tableM.setValueAt(m.getNama(), i, 0);
            tableM.setValueAt(tipe,i,1);
            tableM.setValueAt(m.getLevel(), i, 2);
            tableM.setValueAt(m.getHP(),i,3);
            tableM.setValueAt(m.getAtt(),i,4);
            tableM.setValueAt(m.getDef(), i,5);
            i++;
            }catch(Exception e){
            }   
        }i = 0;
        try{
            for (Pelatih p : pelatih){
                tableP.setValueAt(p.getNama(), i, 0);
                tableP.setValueAt(p.getRas(), i, 1);
                tableP.setValueAt(p.getLevel(),i,2);
                if(p.getMonster()!=null){
                    tableP.setValueAt(p.getMonster().getNama(), i, 3);
                }
                i++;
            }
        }catch(Exception e){
            
        }
    }
    public void pecatMonster(JTable tableP){
        int i = 0;
        boolean berhasil = false;
        try {
            i = tableP.getSelectedRow();
            berhasil = app.putusIkatan((String) tableP.getValueAt(i, 3));
            if (berhasil) {
                JOptionPane.showConfirmDialog(frame, "Pecat Berhasil", "Result", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                tableP.setValueAt("", i, 3);
            } else {
                JOptionPane.showConfirmDialog(frame, "Pecat Gagal", "Result", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException headlessException) {
        }
    }
    public void rekrutMonster(JTable tableP,JTable tableM){
        int i = 0;
        int j = 0;
        String namaP = null;
        String namaM = null;
        boolean berhasil = false;
        try {
            i = tableP.getSelectedRow();
            j = tableM.getSelectedRow();
            namaP = (String) tableP.getValueAt(i, 0);
            namaM = (String) tableM.getValueAt(j, 0);
            berhasil = app.jalinIkatan(namaM, namaP);
            if (berhasil) {
                JOptionPane.showConfirmDialog(frame, "Rekrut Berhasil", "Result", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                tableP.setValueAt(namaM, i, 3);
            } else {
                JOptionPane.showConfirmDialog(frame, "Rekrut Gagal", "Result", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException headlessException) {
        }
    }
    
}
