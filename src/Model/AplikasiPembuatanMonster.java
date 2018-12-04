/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deking
 */
public class AplikasiPembuatanMonster {
    private Database db;

    public AplikasiPembuatanMonster() {
        db = new Database();
    }
    public boolean saveMonster(Monster m){
        db.connect();
        String tipe = "Monster";
        if (m instanceof EarthElemental){
            tipe = "Bumi";
        }else if(m instanceof FireElemental){
            tipe = "Api";
        }else if (m instanceof WaterElemental){
            tipe = "Air";
        }
        String s = "insert into Monster values ('"+m.getNama()+"','"+tipe+"',"+m.getLevel()+","+m.getExp()+","+
                m.getHP()+","+m.getAtt()+","+m.getDef()+","+m.getExptres()+");";
        boolean bol = db.eksekusiQuery(s);
        db.disconnect();
        return bol;
    }
}
