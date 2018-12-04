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
public class Island {
    private String type;
    private int status;
    
    public Island(String type, int status){
        this.type = type;
        this.status = status;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    
    public void setStatus(int s){
        this.status = s;
    }
    
    public int getStatus(){
        return status;
    }
    
    public void MonsterStatus(Monster m){
        switch (status) {
            case 0 : if (m instanceof FireElemental){
                        m.gainHP(20);
                     }
                     break;
            case 1 : if (m instanceof WaterElemental){
                        m.gainAtt(10);
                     }
            case 2 : if (m instanceof EarthElemental){
                        m.gainDef(10);
            }
            default : break;
        }
    }
}
