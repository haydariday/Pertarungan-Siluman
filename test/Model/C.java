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
public class C extends B{

    public C(String nama) {
        super(nama);
    }
    @Override
    public String toString(){
        return "this is C "+ name;
    }
}
