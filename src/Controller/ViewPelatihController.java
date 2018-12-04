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
public class ViewPelatihController implements ActionListener{
    private AplikasiViewPelatih app;
    private ViewPelatih frame;
    
    public ViewPelatihController(){
        app = new AplikasiViewPelatih();
        
        frame = new ViewPelatih();
        frame.getHapusPelatihBtn().addActionListener(this);
        frame.getKembaliBtn().addActionListener(this);
        frame.getPerbaharuiBtn().addActionListener(this);
        frame.getPengaturanSilumanBtn().addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frame.getPerbaharuiBtn())){
            refreshTable(frame.getTable(),app.GetAllPelatih());
        }try{
            if(ae.getSource().equals(frame.getHapusPelatihBtn())){
                int i = frame.getTable().getSelectedRow();
                boolean berhasil = app.deletePelatih((String) frame.getTable().getValueAt(i, 0));
                if (berhasil){
                JOptionPane.showConfirmDialog(frame, "Hapus Berhasil","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
                for (int j =0;j<4;j++)
                frame.getTable().setValueAt("", i, j);
                }else
                JOptionPane.showConfirmDialog(frame, "Hapus Gagal","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
        }
        if(ae.getSource().equals(frame.getKembaliBtn())){
            frame.setVisible(false);
            new TitleController();
        }if(ae.getSource().equals(frame.getPengaturanSilumanBtn())){
            frame.setVisible(false);
            new RekrutmenMonsterController();
        }
    }
    
    public void refreshTable(JTable table, ArrayList<Pelatih> pelatih){
        table.clearSelection();
        int rows = table.getRowCount();
        int i = 0;
        int j = 0;
        for (i = rows - 1; i >= 0; i--) {
            for (j =0;j<4;j++){
                table.setValueAt("", i, j);
            }
        }
        i = 0;
        try{
            for (Pelatih p : pelatih){
                table.setValueAt(p.getNama(), i, 0);
                table.setValueAt(p.getRas(), i, 1);
                table.setValueAt(p.getLevel(),i,2);
                if(p.getMonster()!=null){
                    table.setValueAt(p.getMonster().getNama(), i, 3);
                }
                i++;
            }
        }catch(Exception e){
            
        }
    }
}
