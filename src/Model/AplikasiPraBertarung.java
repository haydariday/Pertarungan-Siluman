/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deking
 */
public class AplikasiPraBertarung {
    private Database db;
    
    public AplikasiPraBertarung() {
        db = new Database();
    }
    public ArrayList<Pelatih> GetAllPelatih(){
        db.connect();
        ArrayList<Pelatih> arrP = new ArrayList();
        ResultSet rs = db.getData("Select * from Pelatih;");
        int i = 0;
        String namaM = null;
        try{
            while(rs.next()){
                namaM = rs.getString(7);
                if(namaM != null&&namaM !=""){
                arrP.add(new Pelatih((String) rs.getString(1), rs.getString(2),
                    rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6)));
                arrP.get(i).setMonster(addMonster(namaM));
                namaM = null;
                i++;
                }
            }
        }
            catch(Exception e){
        }finally{
        db.disconnect();}
        return arrP;
    }
    public Monster addMonster(String namaM){
        ResultSet rsm;
        db.connect();
        rsm = db.getData("Select * from Monster where nama = '"+namaM+"';");
        Monster m = null;
        try {
            if(rsm.first()){
                switch(rsm.getString("tipe")){
                    case "Api" : m = new FireElemental(rsm.getString(1), rsm.getInt(3), rsm.getDouble(4), rsm.getDouble(5), rsm.getDouble(6), rsm.getDouble(7), rsm.getDouble(8));
                    break;
                    case "Air" : m = new WaterElemental(rsm.getString(1), rsm.getInt(3), rsm.getDouble(4), rsm.getDouble(5), rsm.getDouble(6), rsm.getDouble(7), rsm.getDouble(8));
                    break;
                    case "Bumi" : m = new EarthElemental(rsm.getString(1), rsm.getInt(3), rsm.getDouble(4), rsm.getDouble(5), rsm.getDouble(6), rsm.getDouble(7), rsm.getDouble(8));
                    break;
                    default : break;}
            }   } catch (SQLException ex) {
            Logger.getLogger(AplikasiViewPelatih.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        db.disconnect();}
        return m;
    }
}
