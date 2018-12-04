/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;
/**
 *
 * @author Deking
 */
public class A {
    private List<B> b;
    private int i = 1;
    public A(){
        b = new ArrayList<>();
    }
    public void add(B b){
        this.b.add(b);
        i++;
    }
    public void show(){
        b.forEach(System.out::println);
    }
}
