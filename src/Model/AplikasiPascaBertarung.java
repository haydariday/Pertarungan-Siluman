/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Deking
 */
public class AplikasiPascaBertarung {
    private AplikasiLevelUp lvlUp;
    private Pelatih pelatih1;
    private boolean lvlpelatih1naik;
    private Pelatih pelatih2;
    private boolean lvlpelatih2turun;
    private Monster mon1;
    private int mon1Up;
    private Monster mon2;
    private int mon2Up;
    
    public AplikasiPascaBertarung(Pelatih pel1, Pelatih pel2, Monster mon1, Monster mon2){
        lvlUp = new AplikasiLevelUp();
        pelatih1 = pel1;
        pelatih2 = pel2;
        this.mon1 = mon1;
        this.mon2 = mon2;
        mon1Up = 0;
        mon2Up = 0;
        lvlpelatih1naik = false;
        lvlpelatih2turun = false;
        int lvl1 = pelatih1.getLevel();
        int lvl2 = pelatih2.getLevel();
        pelatih1.gainExp(pelatih2.giveExp());
        if (lvl1<pelatih1.getLevel())
            lvlpelatih1naik = true;
        lvlUp.updateData(pelatih1);
        if (lvl2>pelatih2.getLevel())
            lvlpelatih2turun = true;
        lvlUp.updateData(pelatih2);
        int lvl = this.mon1.getLevel();
        double tempExp = this.mon1.giveExp();
        this.mon1.gainExp(this.mon2.giveExp());
        while (lvl<this.mon1.getLevel()){
            lvl++;
            mon1Up++;
        }lvl = this.mon2.getLevel();
        this.mon2.gainExp(tempExp);
        while (lvl<this.mon2.getLevel()){
            lvl++;
            mon2Up++;
        }
    }

    public AplikasiLevelUp getLvlUp() {
        return lvlUp;
    }

    public void setLvlUp(AplikasiLevelUp lvlUp) {
        this.lvlUp = lvlUp;
    }

    public boolean isLvlpelatih1naik() {
        return lvlpelatih1naik;
    }

    public void setLvlpelatih1naik(boolean lvlpelatih1naik) {
        this.lvlpelatih1naik = lvlpelatih1naik;
    }

    public boolean isLvlpelatih2turun() {
        return lvlpelatih2turun;
    }

    public void setLvlpelatih2turun(boolean lvlpelatih2turun) {
        this.lvlpelatih2turun = lvlpelatih2turun;
    }

    public int getMon1Up() {
        return mon1Up;
    }

    public void setMon1Up(int mon1Up) {
        this.mon1Up = mon1Up;
    }

    public int getMon2Up() {
        return mon2Up;
    }

    public void setMon2Up(int mon2Up) {
        this.mon2Up = mon2Up;
    }
}
