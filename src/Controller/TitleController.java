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
public class TitleController implements ActionListener {
    private AplikasiTitle app;
    private PembuatanMonsterController pembuatanMonCtr;
    private PembuatanPelatihController pembuatanPelCtr;
    private ViewMonsterController viewMonCtr;
    private ViewPelatihController viewPelCtr;
    private Title frame;
    
    public TitleController(){
        app = new AplikasiTitle();
        frame = new Title();
        frame.getBuatSiluman().addActionListener(this);
        frame.getBuatpelatihBtn().addActionListener(this);
        frame.getDataPelatihBtn().addActionListener(this);
        frame.getDataSilumanBtn().addActionListener(this);
        frame.getBertarungBtn().addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frame.getBuatpelatihBtn())){
            frame.setVisible(false);
            pembuatanPelCtr = new PembuatanPelatihController();
        }
        if(ae.getSource().equals(frame.getBuatSiluman())){
            frame.setVisible(false);
            pembuatanMonCtr = new PembuatanMonsterController();
        }
        if(ae.getSource().equals(frame.getDataPelatihBtn())){
            frame.setVisible(false);
            viewPelCtr = new ViewPelatihController();
        }
        if(ae.getSource().equals(frame.getDataSilumanBtn())){
            frame.setVisible(false);
            viewMonCtr = new ViewMonsterController();
        }if(ae.getSource().equals(frame.getBertarungBtn())){
            frame.setVisible(false);
            new PraBertarungController();
        }
        
    }
}
