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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 *
 * @author Deking
 */
public class BertarungController implements ActionListener{
    private AplikasiBertarung app;
    private Bertarung frame;
    private Pelatih pelatih1;
    private Pelatih pelatih2;
    private Monster mon1;
    private Monster mon2;
    private int ronde;
    public BertarungController(Pelatih pel1, Pelatih pel2){
        app = new AplikasiBertarung();
        frame = new Bertarung();
        this.pelatih1 = pel1;
        this.pelatih2 = pel2;
        mon1 = app.setMonster(pel1.getMonster());
        mon2 = app.setMonster(pel2.getMonster());
        ronde = 0;
        inisiasi();
        frame.getSerangBtn().addActionListener(this);
        frame.getBertahanBtn().addActionListener(this);
        frame.getSkillsBtn().addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(frame.getSerangBtn())){
            frame.getPanelPlayer().setVisible(false);
            serang(mon1,mon2);
            ronde++;
            CPU(mon1, mon2);
            ronde++;
            frame.getPanelPlayer().setVisible(true);
            end();
        }if (ae.getSource().equals(frame.getBertahanBtn())){
            frame.getPanelPlayer().setVisible(false);
            bertahan(mon1);
            ronde++;
            CPU(mon1,mon2);
            ronde++;
            frame.getPanelPlayer().setVisible(true);
            end();
        }if(ae.getSource().equals(frame.getSkillsBtn())){
            frame.getPanelPlayer().setVisible(false);
            if (mon1.getSp()!=100)
                JOptionPane.showConfirmDialog(frame, "SkillBtn tidak bisa digunakan, 'Titik Puncak' belum mencapai 100%","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            else{
            skills(mon1, mon2);
            ronde++;
            CPU(mon1,mon2);
            ronde++;
            end();
            }
            frame.getPanelPlayer().setVisible(true);
        }
    }
    public void inisiasi(){
        
        int tipe = app.getIsland().getStatus();
        try {
            switch (tipe) {
                case 0:
                    frame.getBackgroundPnl().setBackground(Color.red);
                    break;
                case 1:
                    frame.getBackgroundPnl().setBackground(Color.blue);
                    break;
                case 2:
                    frame.getBackgroundPnl().setBackground(Color.green);
                    break;
                default:
                    frame.getBackgroundPnl().setBackground(Color.PINK);
            }
            app.pengaruhiMon(mon1);
            app.pengaruhiMon(mon2);
        } catch (Exception e) {
        }finally{
            refresh();
            
        }
    }
    public void refresh(){
        frame.getMusuhATTLbl().setText(String.valueOf(mon2.getAtt()));
        frame.getMusuhDEFLbl().setText(String.valueOf(mon2.getDef()));
        frame.getMusuhHPLbl().setText(String.valueOf(mon2.getHP()));
        frame.getMusuhLVLbl().setText("LV"+String.valueOf(mon2.getLevel()));
        frame.getMusuhNamaLbl().setText(String.valueOf(mon2.getNama()));
        frame.getNamaLbl().setText(String.valueOf(mon1.getNama()));
        frame.getLVLbl().setText("LV"+String.valueOf(mon1.getLevel()));
        frame.getHPLbl().setText(String.valueOf(mon1.getHP()));
        frame.getATTLbl().setText(String.valueOf(mon1.getAtt()));
        frame.getDEFLbl().setText(String.valueOf(mon1.getDef()));
        frame.getTahanLbl().setText(String.valueOf(mon1.getTahan())+"%");
        frame.getTitikPuncakLbl().setText(String.valueOf(mon1.getSp())+"%");
        frame.getNamaLbl1().setText(String.valueOf(mon1.getNama()));
        frame.getMusuhNamaLbl1().setText(String.valueOf(mon2.getNama()));
    }
    public void serang(Monster nyerang, Monster bertahan){
        double att = nyerang.getAtt();
        double def = bertahan.getDef();
        double a = 0;
        double d = 0;
        a = app.randomizeDouble(0, att);
        d = app.randomizeDouble(0, def);
        if (ronde%2 ==0){
            frame.getPanelNyerang().setVisible(true);
            frame.getRandomATTLbl().setText(String.valueOf(a));
            frame.getRandomDEFLbl().setText(String.valueOf(d));}
        else {
            frame.getPanelNyerang1().setVisible(true);
            frame.getRandomATTLbl1().setText(String.valueOf(a));
            frame.getRandomDEFLbl1().setText(String.valueOf(d));}
            int i = app.serangOpsi(a, d, nyerang, bertahan);
            if (ronde%2 ==0){
                switch (i){
                    case 0 : frame.getKeteranganTxt().setText("Serangan berhasil diTahan, penahan mendapat bonus nilai 'Titik Puncak'.");break;
                    case 1 : frame.getKeteranganTxt().setText("Serangan berhasil, "+bertahan.getNama()+" berkurang nyawa sebesar "+(a-d)+".");break;
                    case 2 : frame.getKeteranganTxt().setText("Serangan berhasil ditangkis, penahan dan penyerang mendapat bonus nilai 'Titik Puncak'.");break;
                    case 3 : frame.getKeteranganTxt().setText("Serangan gagal, "+nyerang.getNama()+" berkurang nyawa sebesar "+(d-a)+".");break;
                }}
            else {
                switch (i){
                    case 0 : frame.getKeteranganTxt1().setText("Serangan berhasil diTahan, penahan mendapat bonus nilai 'Titik Puncak'.");break;
                    case 1 : frame.getKeteranganTxt1().setText("Serangan berhasil, "+bertahan.getNama()+" berkurang nyawa sebesar "+(a-d)+".");break;
                    case 2 : frame.getKeteranganTxt1().setText("Serangan berhasil ditangkis, penahan dan penyerang mendapat bonus nilai 'Titik Puncak'.");break;
                    case 3 : frame.getKeteranganTxt1().setText("Serangan gagal, "+nyerang.getNama()+" berkurang nyawa sebesar "+(d-a)+".");break;
        }}
        refresh();
    }public void bertahan(Monster m){
        app.bertahan(m);
        if (ronde%2 ==0){
            frame.getKeteranganTxt().setText(m.getNama()+" Bertahan, mendapatkan bonus 'Tahan' dan 'Titik Puncak'.");
            frame.getPanelNyerang().setVisible(false);
        }else{
            frame.getKeteranganTxt1().setText(m.getNama()+" Bertahan, mendapatkan bonus 'Tahan' dan 'Titik Puncak'.");
            frame.getPanelNyerang1().setVisible(false);
        }refresh();
    }
    public void skills(Monster m1, Monster m2){
        app.Skills(m1, m2);
        if (ronde%2 ==0){    
            frame.getPanelNyerang().setVisible(false);
            if (m1 instanceof FireElemental){
                frame.getKeteranganTxt().setText(m1.getNama()+" Menggunakan Skill 'Bola Api Ajaib', "+m2.getNama()+" dikurangi dengan 200% ATT milik "+m1.getNama()+".");
            }
            if (m1 instanceof WaterElemental){
                frame.getKeteranganTxt().setText(m1.getNama()+" Menggunakan Skill 'Tukar Aliran Kehidupan', HP "+m2.getNama()+" ditukar dengan HP "+m1.getNama()+".");
            }
            if (m1 instanceof EarthElemental){
                frame.getKeteranganTxt().setText(m1.getNama()+" Menggunakan Skill 'Baju Zirah Batu Ajaib', "+m1.getNama()+" mendapatkan bonus nilai 2x HP&DEF.");
            }}
        else {
            frame.getPanelNyerang1().setVisible(false);
            if (m1 instanceof FireElemental){
                frame.getKeteranganTxt1().setText(m1.getNama()+" Menggunakan Skill 'Bola Api Ajaib', "+m2.getNama()+" dikurangi dengan 200% ATT milik "+m1.getNama()+".");
            }
            if (m1 instanceof WaterElemental){
                frame.getKeteranganTxt1().setText(m1.getNama()+" Menggunakan Skill 'Tukar Aliran Kehidupan', HP "+m2.getNama()+" ditukar dengan HP "+m1.getNama()+".");
            }
            if (m1 instanceof EarthElemental){
                frame.getKeteranganTxt1().setText(m1.getNama()+" Menggunakan Skill 'Baju Zirah Batu Ajaib', "+m1.getNama()+" mendapatkan bonus nilai 2x HP&DEF.");
            }}
        refresh();
    }
    public void CPU(Monster m1,Monster m2){
        if(m2.getSp()==100){
            if(m2.getHP()<m1.getHP() || m2 instanceof WaterElemental==false){
                skills(m2, m1);
            }else {
                int pil = app.randomizeInt(1, 2);
                switch (pil){
                case 1 : serang(m2, m1);break;
                case 2 : bertahan(m2);break;
                }
            }
        }else {
            int pilihan = app.randomizeInt(1, 2);
            switch (pilihan){
                case 1 : serang(m2, m1);break;
                case 2 : bertahan(m2);break;
            }
        }
    }
    public void end(){
        if (mon1.getHP()<=0){
            JOptionPane.showConfirmDialog(frame, "Monster Anda Kalah","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            frame.setVisible(false);
            new PascaBertarungController(pelatih2, pelatih1, pelatih2.getMonster(), pelatih1.getMonster());
        }else if (mon2.getHP()<=0){
            JOptionPane.showConfirmDialog(frame, "Monster Anda Menang","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            frame.setVisible(false);
            new PascaBertarungController(pelatih1, pelatih2, pelatih1.getMonster(), pelatih2.getMonster());
        }else
            JOptionPane.showConfirmDialog(frame, "Ronde "+ronde/2,"Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
    }
        
        
}
