/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Deking
 */
public abstract class Monster implements Levelable{
    private String nama;
    private double experience;
    private int level;
    private double att;
    private double hp;
    private double def;
    private double sp;
    private double tahan;
    private double exptres;
    
    public Monster(String nama){
        this.nama = nama;
        this.hp = 100;
        this.def = 10;
        this.att = 10;
        this.sp = 0;
        this.tahan = 0;
        this.exptres = 2;
        this.experience = 0;
        this.level = 1;
    }
    public Monster(String nama, int level, double exp, double hp,
             double att, double def, double exptres){
        this.nama = nama;
        this.level = level;
        this.hp = hp;
        this.experience = exp;
        this.att = att;
        this.def = def;
        this.exptres = exptres;
        this.sp = 0;
        this.tahan = 0;
    }
    public void gainTahan(double i){
        if(tahan+i<=100)
            tahan = tahan+i;
        else
            tahan = 100;
    }
    public  void gainSp(double  i){
        if(sp+i<=100)
            sp = sp+i;
        else
            sp = 100;
    }
    public double getExptres() {
        return exptres;
    }

    public void setExptres(double exptres) {
        this.exptres = exptres;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    public void setHP(double hp){
        this.hp=hp;
    }

    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        if (sp<=100)
        this.sp = sp;
    }

    public double getTahan() {
        return tahan;
    }

    public void setTahan(double tahan) {
        if (tahan <=100)
        this.tahan = tahan;
    }
    public void gainHP(double hp){
        this.hp = this.hp+hp;
    }
    public void dropHP(double hp){
        this.hp = this.hp-hp;
    }
    
    public double getHP(){
        return hp;
    }
    
    public void setAtt(double att){
        this.att=att;
    }
    public void gainAtt(double att){
        this.att = this.att+att;
    }
    
    public void dropAtt(double att){
        this.att = this.att-att;
    }
    
    public double getAtt(){
        return att;
    }
    
    public void setDef(double def){
        this.def=def;
    }
    
    public void gainDef(double def){
        this.def = this.def+def;
    }
    
    public void dropDef(double def){
        this.def = this.def-def;
    }
    
    public double getDef(){
        return def;
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
        while (experience >= exptres) {
            exptres = exptres+ Math.ceil(exptres*3/2);
            levelUp();
        } 
    }
    
    @Override
    public double giveExp() {
        if (experience-experience*1/4 >= 1) {
            return experience*1/4;
        }else
            return 1;
    }

    @Override
    public void levelUp() {
        level++;
        System.out.println("Monster "+nama+" telah level up menjadi level "+level);
    }
    
    public abstract void skills(Monster m);
    
}