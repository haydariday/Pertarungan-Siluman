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
import javax.swing.JTable;
import javax.swing.WindowConstants;
/**
 *
 * @author Deking
 */
public class PraBertarungController implements ActionListener {
    private AplikasiPraBertarung app;
    private PraBertarung frame;
    
    public PraBertarungController(){
        app = new AplikasiPraBertarung();
        frame = new PraBertarung();
        frame.getBertarung().addActionListener(this);
        frame.getKembaliBtn().addActionListener(this);
        frame.getPerbaharuiBtn().addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frame.getPerbaharuiBtn())){
            refreshTable(frame.getTablePelatih1(), frame.getTablePelatih2(), app.GetAllPelatih(), app.GetAllPelatih());
        }if(ae.getSource().equals(frame.getKembaliBtn())){
            frame.setVisible(false);
            new TitleController();
        }if((ae.getSource().equals(frame.getBertarung())&&(frame.getTablePelatih1().getSelectedRow()!= -1)&&(frame.getTablePelatih2().getSelectedRow()!=-1))){
            int i = frame.getTablePelatih1().getSelectedRow();
            int j = frame.getTablePelatih2().getSelectedRow();
            if(frame.getTablePelatih1().getSelectedRow() != frame.getTablePelatih2().getSelectedRow()){
                frame.setVisible(false);
                new BertarungController(app.GetAllPelatih().get(i),app.GetAllPelatih().get(j));}
        }if(ae.getSource().equals(frame.getKembaliBtn())){
            frame.setVisible(false);
            new TitleController();
        }
    }
    public void refreshTable(JTable tableP1,JTable tableP2, ArrayList<Pelatih> pelatih1, ArrayList<Pelatih> pelatih2){
        tableP1.clearSelection();
        tableP2.clearSelection();
        int rowsP1 = tableP1.getRowCount();
        int rowsP2 = tableP2.getRowCount();
        String tipe = null;
        int i = 0;
        int j = 0;
        for (i = rowsP1 - 1; i >= 0; i--) {
            for (j =0;j<7;j++){
                tableP1.setValueAt("", i, j);
            }
        }
        i = 0;
        j = 0;
        for (i = rowsP2 - 1; i >= 0; i--) {
            for (j =0;j<7;j++){
                tableP2.setValueAt("", i, j);
            }
        }
        i = 0;
        try{
            for (Pelatih p : pelatih1){
                tableP1.setValueAt(p.getNama(), i, 0);
                tableP1.setValueAt(p.getLevel(), i, 1);
                if(p.getMonster()!=null){
                    tableP1.setValueAt(p.getMonster().getNama(), i, 2);
                    tableP1.setValueAt(p.getMonster().getHP(), i, 4);
                    tableP1.setValueAt(p.getMonster().getAtt(), i, 5);
                    tableP1.setValueAt(p.getMonster().getDef(), i, 6);
                    if(p.getMonster() instanceof FireElemental){
                        tipe = "Api";
                    }else if(p.getMonster() instanceof WaterElemental){
                        tipe = "Air";
                    }else if(p.getMonster() instanceof EarthElemental){
                        tipe = "Bumi";
                    }else
                        tipe = null;
                }tableP1.setValueAt(tipe, i, 3);
                i++;
            }
        }catch(Exception e){
            
        }
        i = 0;
        try{
            for (Pelatih p : pelatih1){
                tableP2.setValueAt(p.getNama(), i, 0);
                tableP2.setValueAt(p.getLevel(), i, 1);
                if(p.getMonster()!=null){
                    tableP2.setValueAt(p.getMonster().getNama(), i, 2);
                    tableP2.setValueAt(p.getMonster().getHP(), i, 4);
                    tableP2.setValueAt(p.getMonster().getAtt(), i, 5);
                    tableP2.setValueAt(p.getMonster().getDef(), i, 6);
                    if(p.getMonster() instanceof FireElemental){
                        tipe = "Api";
                    }else if(p.getMonster() instanceof WaterElemental){
                        tipe = "Air";
                    }else if(p.getMonster() instanceof EarthElemental){
                        tipe = "Bumi";
                    }else
                        tipe = null;
                }tableP2.setValueAt(tipe, i, 3);
                i++;
            }
        }catch(Exception e){
            
        }
    }
}
