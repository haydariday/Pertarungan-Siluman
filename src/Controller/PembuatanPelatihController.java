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
/**
 *
 * @author Deking
 */
public class PembuatanPelatihController implements ActionListener {

    private AplikasiPembuatanPelatih app;
    private PembuatanPelatih frame;

    public PembuatanPelatihController() {
        app = new AplikasiPembuatanPelatih();
        
        frame = new PembuatanPelatih();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //matiin program
        frame.getBuatpelatihBtn().addActionListener(this);
        frame.getKembaliBtn().addActionListener(this);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(frame.getBuatpelatihBtn())){
            String nama = null;
            String ras = null;
            try {
                nama = frame.getInputnamaTxt().getText();
                if (frame.getRasBtn().getSelection().equals(frame.getManusiaRdo().getModel())) {
                    ras = "Manusia";
                } else if (frame.getRasBtn().getSelection().equals(frame.getPeriRdo().getModel())) {
                    ras = "Peri";
                } else if (frame.getRasBtn().getSelection().equals(frame.getKurcaciRdo().getModel())) {
                    ras = "Kurcaci";
                } else {
                    ras = null;
                }
            } catch (Exception e) {
            }
            Pelatih pel = new Pelatih(nama,ras);
            boolean berhasil = app.SavePelatih(pel);
            if (berhasil){
                JOptionPane.showConfirmDialog(frame, "Penyimpanan Data Berhasil","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            }else
                JOptionPane.showConfirmDialog(frame, "Penyimpanan Data Gagal","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if(ae.getSource().equals(frame.getKembaliBtn())){
            frame.setVisible(false);
            new TitleController();
        }
    }
    public void reset(){
        frame.getRasBtn().clearSelection();
        frame.getInputnamaTxt().setText("");
    }
    
}
