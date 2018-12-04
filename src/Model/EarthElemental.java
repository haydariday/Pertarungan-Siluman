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
public class EarthElemental extends Monster {

    public EarthElemental(String nama) {
        super(nama);
        gainHP(10);
    }

    public EarthElemental(String nama, int level, double exp, double hp, double att, double def, double exptres) {
        super(nama, level, exp, hp, att, def, exptres);
    }
    

    @Override
    public void skills(Monster m) {
        System.out.println("Zirah Batu Ajaib");
        gainDef(getDef()*0.2);
        gainHP(getHP()*0.4);
    }
    
}
