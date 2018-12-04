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
public class AplikasiLevelUp {
   private Database db;

   public AplikasiLevelUp(){
       db = new Database();
   }
   public boolean updateData(Monster mon){
       db.connect();
       String s = "update monster set lvl = "+mon.getLevel()
               +", exp ="+mon.getExp()
               +",`hp`="+mon.getHP()
               +",`att`="+mon.getAtt()
               +",`def`="+mon.getDef()
               +",`exptres`="+mon.getExptres()
               +" WHERE nama ='"+mon.getNama()+"';";
       boolean bol = db.eksekusiQuery(s);
       db.disconnect();
       return bol;
   }
   public boolean updateData(Pelatih pel){
       db.connect();
       String s = "update pelatih set lvl = "+pel.getLevel()
               +", exp = "+pel.getExp()
               +", expmintres = "+pel.getExpmintres()
               +", expmaxtres = "+pel.getExpmaxtres()
               +" where nama = '"+pel.getNama()+"';";
       boolean bol = db.eksekusiQuery(s);
       db.disconnect();
       return bol;
   }
}
