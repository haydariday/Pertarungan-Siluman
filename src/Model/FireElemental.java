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
public class FireElemental extends Monster{

    public FireElemental(String nama) {
        super(nama);
        gainAtt(5);
    }

    public FireElemental(String nama, int level, double exp, double hp, double att, double def, double exptres) {
        super(nama, level, exp, hp, att, def, exptres);
    }

    @Override
    public void skills(Monster m) {
        System.out.println("Bola Api Ajaib");
        double dob = Math.ceil(getAtt()*2);
        m.dropHP(dob);
    }
    
}
