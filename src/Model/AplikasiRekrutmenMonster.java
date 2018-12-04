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
public class AplikasiRekrutmenMonster {
    private Database db;
    
    public AplikasiRekrutmenMonster(){
        db = new Database();
    }
    public ArrayList<Monster> getAllMonster(){
        db.connect();
        Monster m = null;
        ArrayList<Monster> arrayM = new ArrayList<>();
        ResultSet rs = db.getData("select * from monster");
        try {
            while (rs.next()) {
                switch(rs.getString("tipe")){
                    case "Api" : m = new FireElemental(rs.getString(1), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8));
                        break;
                    case "Air" : m = new WaterElemental(rs.getString(1), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8));
                        break;
                    case "Bumi" : m = new EarthElemental(rs.getString(1), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8));
                        break;
                    default : break;
                }
                arrayM.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        db.disconnect();}
        return arrayM;
    }
    public ArrayList<Pelatih> GetAllPelatih(){
        db.connect();
        ArrayList<Pelatih> arrP = new ArrayList();
        ResultSet rs = db.getData("Select * from Pelatih;");
        int i = 0;
        String namaM = null;
        Monster m = null;
        try{
            while(rs.next()){
                arrP.add(new Pelatih((String) rs.getString(1), rs.getString(2),
                    rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6)));
                namaM = rs.getString(7);
                if(namaM != null&&namaM !=""){
                    arrP.get(i).setMonster(addMonster(namaM));
                }
                namaM = null;
                i++;
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
     public boolean putusIkatan(String namaMonster){
        db.connect();
        ResultSet rs = db.getData("Select nama from pelatih where Silumanbotol='"+namaMonster+"';");
        boolean berhasil = false;
        try {
            if (rs.next())
                berhasil = db.eksekusiQuery("update pelatih set silumanbotol = null where nama ='"+rs.getString(1)+"';");
        } catch (SQLException ex) {
            Logger.getLogger(AplikasiPembuatanMonster.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        db.disconnect();
        return berhasil;}
    }
    public boolean jalinIkatan(String namaMonster,String namaPelatih){
        db.connect();
        boolean berhasil = false;
        
            ResultSet rs = db.getData("Select nama from monster where nama='" + namaMonster + "';");
        try {
            if(rs.first()){
                
                berhasil = db.eksekusiQuery("update pelatih set silumanbotol = '"+namaMonster+"' where nama = '"+namaPelatih+"';");
            }
        } catch (Exception e) {
        }finally{
        db.disconnect();
        return berhasil;}
    }
   
}
