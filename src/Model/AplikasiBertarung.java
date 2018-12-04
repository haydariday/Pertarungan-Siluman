/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deking
 */
public class AplikasiBertarung {
    private Island island;
    
    public  AplikasiBertarung(){
        String tipe=null;
        int stat = randomizeInt(0, 2);
        setType(tipe,stat);
        island = new Island(tipe,stat);
    }
    public void setType(String type,int stat){
        if (stat == 0)
            type = "Gunung Berapi";
        else if (stat == 1)
            type = "Atlantis";
        else
            type = "Sawah";
    }

    public Island getIsland() {
        return island;
    }

    public void setIsland(Island island) {
        this.island = island;
    }
    
    public void pengaruhiMon(Monster m){
        island.MonsterStatus(m);
    }
    public int randomizeInt(int bot, int top){
        int random = 0;
        random = ThreadLocalRandom.current().nextInt(bot,top+1);
        return random;
    }
    public double randomizeDouble(double bot,double top){
        double random = 0;
        random = ThreadLocalRandom.current().nextDouble(bot, top+1);
        return Math.ceil(random);
    }
    public void halt(int time){
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(AplikasiBertarung.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int serangOpsi(double att,double def,Monster m1,Monster m2){
        double hasil = 0;
        int opsi = 0;
        int tahan = (int) Math.ceil(m2.getTahan());
        int block = randomizeInt(tahan,100);
        if (block == 100){
            m2.setTahan(Math.ceil(m2.getTahan()*0.5));
            m2.gainSp(randomizeDouble(0, 10));
        }
        else{
            hasil = att-def;
            if (hasil>0){
                sakit(m2, hasil);
                opsi = 1;
            }else if (hasil == 0){
                m1.gainSp(randomizeDouble(0, 10));
                m2.gainSp(randomizeDouble(0, 10));
                opsi = 2;
            }else{
                sakit(m1,(-hasil));
                opsi = 3;
            }
        }
        return opsi;
    }
    public void randomAttDef(double att,double def,double hasilatt,double hasildef){
        hasilatt = Math.ceil(randomizeDouble(0, att+1));
        hasildef = Math.ceil(randomizeDouble(0, def+1));
    }
    public void bertahan(Monster m){
        if (m.getTahan() == 0){
            m.gainTahan(randomizeDouble(1, 10));
        }else{
            double tambah = randomizeDouble(0, m.getTahan());
            m.gainTahan(tambah+randomizeDouble(0, 10));
        }
        m.gainSp(randomizeDouble(5, 10));
    }
    public void sakit(Monster m,double damage){
        m.dropHP(damage);
        m.gainSp(randomizeDouble(0, 10));
    }
    public Monster setMonster(Monster m){
        Monster mon = null;
        if(m instanceof FireElemental){
            mon = new FireElemental(m.getNama(), m.getLevel(), m.getExp(), m.getHP(), m.getAtt(), m.getDef(), m.getExptres());
        }else if (m instanceof WaterElemental){
            mon = new WaterElemental(m.getNama(), m.getLevel(), m.getExp(), m.getHP(), m.getAtt(), m.getDef(), m.getExptres());
        }else if (m instanceof EarthElemental){
            mon = new EarthElemental(m.getNama(), m.getLevel(), m.getExp(), m.getHP(), m.getAtt(), m.getDef(), m.getExptres());
        }
        return mon;
    }
    public boolean Skills(Monster mskill,Monster m){
        boolean berhasil = false;
        if (mskill.getSp() == 100){
            berhasil = true;
            mskill.skills(m);
            mskill.setSp(0);
        }
        return berhasil;
    }
}
