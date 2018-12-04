/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Deking
 */
public class AplikasiPembuatanPelatih {
    private Database db;

    public AplikasiPembuatanPelatih() {
        db = new Database();
    }
    public boolean SavePelatih(Pelatih pel){
        db.connect();
        boolean bol = db.eksekusiQuery("insert into pelatih (nama, ras, lvl, exp, expmintres, expmaxtres) values ('"+pel.getNama()+"','"+pel.getRas()+"',"+pel.getLevel()+","+pel.getExp()+","+pel.getExpmintres()+","
                +pel.getExpmaxtres()+");");
        db.disconnect();
        return bol;
    }
}    
