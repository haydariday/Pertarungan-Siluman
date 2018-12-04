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
public class WaterElemental extends Monster {

    public WaterElemental(String nama) {
        super(nama);
        gainDef(5);
    }
    public WaterElemental(String nama, int level, double exp, double hp,
             double att, double def, double exptres){
        super(nama, level, exp, hp, att, def, exptres);
    }

    @Override
    public void skills(Monster m) {
        System.out.println("Tukar Aliran Kehidupan");
        double temp;
        if (getHP()<35&&m.getHP()<35){
            setHP(35);m.setHP(35);
        }else if (m.getHP()<35){
            m.setHP(getHP());
            setHP(35);
        }else if (getHP()<35){
            setHP(m.getHP());
            m.setHP(35);
        }
        else{
            temp = getHP();
            setHP(m.getHP());
            m.setHP(temp);
        }
    }
    
}
