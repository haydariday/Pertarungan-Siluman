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
public class PembuatanMonsterController implements ActionListener {
    private AplikasiPembuatanMonster app;
    private PembuatanMonster frame;
    private double att;
    private double def;
    private double hp;
    private double pt;
    
    public PembuatanMonsterController() {
        app = new AplikasiPembuatanMonster();
        pt = 10;
        att = 0;
        def = 0;
        hp = 0;
        frame = new PembuatanMonster();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //matiin program
        frame.getBuatsilumanBtn().addActionListener(this);
        frame.getAirRdo().addActionListener(this);
        frame.getApiRdo().addActionListener(this);
        frame.getBumiRdo().addActionListener(this);
        frame.getResetBtn().addActionListener(this);
        frame.getPlusattBtn().addActionListener(this);
        frame.getPlusdefBtn().addActionListener(this);
        frame.getPlushpBtn().addActionListener(this);
        frame.getKembaliBtn().addActionListener(this);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(frame.getAirRdo())){
            resetTipe();
            frame.getIntattLbl().setText("10");
            frame.getIntdefLbl().setText("15");
            frame.getInthpLbl().setText("100");
        }
        if (ae.getSource().equals(frame.getApiRdo())){
            resetTipe();
            frame.getIntattLbl().setText("15");
            frame.getIntdefLbl().setText("10");
            frame.getInthpLbl().setText("100");
        }
        if (ae.getSource().equals(frame.getBumiRdo())){
            resetTipe();
            frame.getIntattLbl().setText("10");
            frame.getIntdefLbl().setText("10");
            frame.getInthpLbl().setText("110");
        }
        if (ae.getSource().equals(frame.getResetBtn())){
            reset();
        }
        if (ae.getSource().equals(frame.getPlusattBtn())&&pt>0){
            att++;
            double bonus = Double.valueOf(frame.getIntattLbl().getText())+1;
            frame.getIntattLbl().setText(String.valueOf(bonus));
            pt--;
            frame.getIntpointLbl().setText(String.valueOf(pt));
        }
        if (ae.getSource().equals(frame.getPlusdefBtn())&&pt>0){
            def++;
            double bonus = Double.valueOf(frame.getIntdefLbl().getText())+1;
            frame.getIntdefLbl().setText(String.valueOf(bonus));
            pt--;
            frame.getIntpointLbl().setText(String.valueOf(pt));
        }
        if (ae.getSource().equals(frame.getPlushpBtn())&&pt>0){
            hp++;
            double bonus = Double.valueOf(frame.getInthpLbl().getText())+1;
            frame.getInthpLbl().setText(String.valueOf(bonus));
            pt--;
            frame.getIntpointLbl().setText(String.valueOf(pt));
        }
        if (ae.getSource().equals(frame.getBuatsilumanBtn())){
            String nama = null;
            String tipe = null;
            Monster m = null;
            try {
                nama = frame.getInputnamaTxt().getText();
                if (frame.getTipeGrpBtn().getSelection().equals(frame.getApiRdo().getModel())) {
                    tipe = "Api";
                } else if (frame.getTipeGrpBtn().getSelection().equals(frame.getAirRdo().getModel())) {
                    tipe = "Air";
                } else if (frame.getTipeGrpBtn().getSelection().equals(frame.getBumiRdo().getModel())) {
                    tipe = "Bumi";
                } else {
                    tipe = null;
                }
            } catch (Exception e) {    
            }
            switch (tipe){
                case "Api" : m = new FireElemental(nama);break;
                case "Air" : m = new WaterElemental(nama);break;
                case "Bumi" : m = new EarthElemental(nama);break;
            }
            m.gainAtt(att);
            m.gainDef(def);
            m.gainHP(hp);
            boolean berhasil = app.saveMonster(m);
            if (berhasil){
                JOptionPane.showConfirmDialog(frame, "Penyimpanan Data Berhasil","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            }else
                JOptionPane.showConfirmDialog(frame, "Penyimpanan Data Gagal","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if (ae.getSource().equals(frame.getKembaliBtn())){
            frame.setVisible(false);
            new TitleController();
        }
    }
    public void reset(){
        frame.getTipeGrpBtn().clearSelection();
        frame.getInputnamaTxt().setText("");
        pt = 10;
        att = 0;
        def = 0;
        hp = 0;
        frame.getIntattLbl().setText(String.valueOf(0));
        frame.getIntdefLbl().setText(String.valueOf(0));
        frame.getInthpLbl().setText(String.valueOf(0));
        frame.getIntpointLbl().setText(String.valueOf(pt));
    }
    public void resetTipe(){
        pt = 10;
        att = 0;
        def = 0;
        hp = 0;
        frame.getIntattLbl().setText(String.valueOf(0));
        frame.getIntdefLbl().setText(String.valueOf(0));
        frame.getInthpLbl().setText(String.valueOf(0));
        frame.getIntpointLbl().setText(String.valueOf(pt));
    }
}
