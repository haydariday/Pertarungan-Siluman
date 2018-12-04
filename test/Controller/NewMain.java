/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.*;
import Model.*;
/**
 *
 * @author Deking
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        a.add(new B("taylor"));
        a.add(new C("heya"));
        a.show();
// TODO code application logic here
    }
    
}
