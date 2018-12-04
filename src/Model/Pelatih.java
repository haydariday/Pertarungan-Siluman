/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;
/**
 *
 * @author Deking
 */
public class Pelatih implements Levelable, LevelablePlus {
    private String nama;
    private double experience; 
    private Monster monster;
    private int level;
    private String ras;
    private double expmaxtres;
    private double expmintres;
    public Pelatih(String nama, String ras){
        this.nama = nama;
        this.ras = ras;
        level = 1;
        experience = 1;
        expmaxtres = 2;
        expmintres = 0;
        monster = null;
    }

    public Pelatih(String nama, String ras, int level,double experience,  double expmintres, double expmaxtres) {
        this.nama = nama;
        this.experience = experience;
        this.level = level;
        this.ras = ras;
        this.expmaxtres = expmaxtres;
        this.expmintres = expmintres;
        monster = null;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    public void setRas(String ras){
        this.ras = ras;
    }
    
    public String getRas(){
        return ras;
    }
    
    @Override
    public void setLevel(int i){
        this.level = i;
    }
    
    @Override
    public int getLevel(){
        return level;
    }
    
    @Override
    public double getExp() {
        return experience;
        }

    @Override
    public void gainExp(double i) {
        experience = experience + i;
        while (experience >= expmaxtres) {
            expmintres = expmaxtres;
            expmaxtres = expmaxtres+ Math.ceil(expmaxtres*3/2);
            levelUp();
        } 
    }
    
    @Override
    public double giveExp() {
        if (experience-experience*1/4 >= 1) {
            double hasil = experience*1/4;
            experience = experience - (experience*1/4);
            while (experience < expmintres){
                expmaxtres = expmintres;
                expmintres = Math.ceil(expmintres*2/5);
                levelDown();
            }
            return hasil;
        }else {
            return 1;
        }
    }

    @Override
    public void levelUp() {
        level++;
        System.out.println("Pelatih "+nama+" telah level up menjadi level "+level);
    }

    public double getExpmaxtres() {
        return expmaxtres;
    }

    public double getExpmintres() {
        return expmintres;
    }
    
    @Override
      public void levelDown() {
        level--;
        System.out.println("Pelatih "+nama+" telah level down menjadi level "+level);
    }
      
    public void setMonster (Monster m) {
        this.monster = m;
    }
    public Monster getMonster(){
        return monster;
    }
    public void removeMonster(){
        monster = null;
    }
}
