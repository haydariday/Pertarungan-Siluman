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
public class PascaBertarungController implements ActionListener{
    private LevelUp frame;
    private AplikasiPascaBertarung app;
    private Pelatih pel1;
    private Pelatih pel2;
    private Monster mon1;
    private Monster mon2;
    private double point1;
    private double point2;
    private double att1;
    private double att2;
    private double hp1;
    private double hp2;
    private double def1;
    private double def2;
    
    public PascaBertarungController(Pelatih p1, Pelatih p2,Monster m1, Monster m2){
        frame = new LevelUp();
        pel1 = p1;
        pel2 = p2;
        mon1 = m1;
        mon2 = m2;
        app = new AplikasiPascaBertarung(pel1, pel2, mon1, mon2);
        inisiasi();
    }

    public void inisiasi() {
        reset1();
        reset2();
        StringBuilder sb = new StringBuilder();
        if (app.isLvlpelatih1naik())
            sb.append("Pelatih "+pel1.getNama()+" naik level menjadi Level "+pel1.getLevel()+".<br>");
        if (app.isLvlpelatih2turun())
            sb.append("Pelatih "+pel2.getNama()+" turun level menjadi Level "+pel2.getLevel()+".<br>");
        if (app.getMon1Up()>0)
            sb.append("Siluman "+mon1.getNama()+" naik level menjadi Level "+mon1.getLevel()+".<br>");
        if (app.getMon2Up()>0)
            sb.append("Siluman "+mon2.getNama()+" naik level menjadi Level "+mon2.getLevel()+".<br>");
        frame.getSelesaiBtn().addActionListener(this);
        frame.getPlusattBtn1().addActionListener(this);
        frame.getPlusattBtn2().addActionListener(this);
        frame.getPlusdefBtn1().addActionListener(this);
        frame.getPlusdefBtn2().addActionListener(this);
        frame.getPlushpBtn1().addActionListener(this);
        frame.getPlushpBtn2().addActionListener(this);
        frame.getResetBtn1().addActionListener(this);
        frame.getResetBtn2().addActionListener(this);
        frame.getKeteranganTxt().setText(sb.toString());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void reset1(){
        point1 = 5*app.getMon1Up();
        hp1 = mon1.getHP();
        att1 = mon1.getAtt();
        def1 = mon1.getDef();
        frame.getNamaMonsterLbl1().setText(mon1.getNama());
        frame.getLevelLbl1().setText("LV "+String.valueOf(mon1.getLevel()));
        frame.getIntattLbl1().setText(String.valueOf(att1));
        frame.getIntdefLbl1().setText(String.valueOf(def1));
        frame.getIntpointLbl1().setText(String.valueOf(point1));
        frame.getInthpLbl1().setText(String.valueOf(hp1));
    }
    public void reset2(){
        point2 = 5*app.getMon2Up();
        hp2 = mon2.getHP();
        att2 = mon2.getAtt();
        def2 = mon2.getDef();
        frame.getNamaMonsterLbl2().setText(mon2.getNama());
        frame.getLevelLbl2().setText("LV "+String.valueOf(mon2.getLevel()));
        frame.getIntattLbl2().setText(String.valueOf(att2));
        frame.getIntdefLbl2().setText(String.valueOf(def2));
        frame.getIntpointLbl2().setText(String.valueOf(point2));
        frame.getInthpLbl2().setText(String.valueOf(hp2));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(frame.getPlusattBtn1())&&point1>0){
            att1++;
            double bonus = Double.valueOf(frame.getIntattLbl1().getText())+1;
            frame.getIntattLbl1().setText(String.valueOf(bonus));
            point1--;
            frame.getIntpointLbl1().setText(String.valueOf(point1));
        }
        if (ae.getSource().equals(frame.getPlusattBtn2())&&point2>0){
            att2++;
            double bonus = Double.valueOf(frame.getIntattLbl2().getText())+1;
            frame.getIntattLbl2().setText(String.valueOf(bonus));
            point2--;
            frame.getIntpointLbl2().setText(String.valueOf(point2));
        }
        if (ae.getSource().equals(frame.getPlusdefBtn1())&&point1>0){
            def1++;
            double bonus = Double.valueOf(frame.getIntdefLbl1().getText())+1;
            frame.getIntdefLbl1().setText(String.valueOf(bonus));
            point1--;
            frame.getIntpointLbl1().setText(String.valueOf(point1));
        }
        if (ae.getSource().equals(frame.getPlusdefBtn2())&&point2>0){
            def2++;
            double bonus = Double.valueOf(frame.getIntdefLbl2().getText())+1;
            frame.getIntdefLbl2().setText(String.valueOf(bonus));
            point2--;
            frame.getIntpointLbl2().setText(String.valueOf(point2));
        }
        if (ae.getSource().equals(frame.getPlushpBtn1())&&point1>0){
            hp1++;
            double bonus = Double.valueOf(frame.getInthpLbl1().getText())+1;
            frame.getInthpLbl1().setText(String.valueOf(bonus));
            point1--;
            frame.getIntpointLbl1().setText(String.valueOf(point1));
        }
        if (ae.getSource().equals(frame.getPlushpBtn2())&&point2>0){
            hp2++;
            double bonus = Double.valueOf(frame.getInthpLbl2().getText())+1;
            frame.getInthpLbl2().setText(String.valueOf(bonus));
            point2--;
            frame.getIntpointLbl2().setText(String.valueOf(point2));
        }
        if (ae.getSource().equals(frame.getResetBtn1())){
            reset1();
        }
        if (ae.getSource().equals(frame.getResetBtn2())){
            reset2();
        }
        if(ae.getSource().equals(frame.getSelesaiBtn())){
            boolean berhasil;
            mon1.setAtt(att1);
            mon1.setDef(def1);
            mon1.setHP(hp1);
            mon2.setAtt(att2);
            mon2.setDef(def2);
            mon2.setHP(hp2);
            berhasil=app.getLvlUp().updateData(mon1);
            berhasil=app.getLvlUp().updateData(mon2);
            if(berhasil)
                JOptionPane.showConfirmDialog(frame, "Penyimpanan Data Berhasil","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showConfirmDialog(frame, "Penyimpanan Data Gagal","Result",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
            frame.setVisible(false);
            new TitleController();
        }
    }
}
