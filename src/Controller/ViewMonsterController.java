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
public class ViewMonsterController implements ActionListener {
    private AplikasiViewMonster app;
    private ViewMonster frame;
    
    public ViewMonsterController(){
        app = new AplikasiViewMonster();
        
        frame = new ViewMonster();
        frame.getHapusBtn().addActionListener(this);
        frame.getRefreshBtn().addActionListener(this);
        frame.getKembaliBtn().addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(frame.getRefreshBtn())){
            refreshTable(frame.getTable(), app.getAllMonster());
        }
        try {
            if (ae.getSource().equals(frame.getHapusBtn())) {
                int i = frame.getTable().getSelectedRow();
                String namaMonster = (String) frame.getTable().getValueAt(i, 0);
                boolean berhasil = app.deleteMonster(namaMonster);
                if (berhasil){
                JOptionPane.showConfirmDialog(frame, "Hapus Berhasil","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
                for (int j =0;j<5;j++)
                frame.getTable().setValueAt("", i, j);
                app.putusIkatan(namaMonster);
                }else
                JOptionPane.showConfirmDialog(frame, "Hapus Gagal","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
        }
        if (ae.getSource().equals(frame.getKembaliBtn())){
            frame.setVisible(false);
            new TitleController();
        }
    }
    public void refreshTable(JTable table, ArrayList<Monster> monster){
        table.clearSelection();
        int rows = table.getRowCount();
        int i = 0;
        int j = 0;
        for (i = rows - 1; i >= 0; i--) {
            for (j =0;j<5;j++){
                table.setValueAt("", i, j);
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
            table.setValueAt(m.getNama(), i, 0);
            table.setValueAt(tipe,i,1);
            table.setValueAt(m.getHP(),i,2);
            table.setValueAt(m.getAtt(),i,3);
            table.setValueAt(m.getDef(), i,4);
            i++;
            }catch(Exception e){
            }
            
        }
    }
}
