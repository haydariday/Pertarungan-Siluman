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

public class AplikasiViewMonster {
    private Database db;

    public AplikasiViewMonster() {
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
    public boolean deleteMonster(String nama){
        db.connect();
        boolean berhasil = db.eksekusiQuery("delete from Monster where nama ='"+nama+"';");
        db.disconnect();
        return berhasil;
    }
    public void putusIkatan(String namaMonster){
        db.connect();
        ResultSet rs = db.getData("Select nama from pelatih where Silumanbotol='"+namaMonster+"';");
        try {
            if (rs.next())
                db.eksekusiQuery("update pelatih set silumanbotol = null where nama ='"+rs.getString(1)+"';");
        } catch (SQLException ex) {
            Logger.getLogger(AplikasiPembuatanMonster.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        db.disconnect();}
    }
}
