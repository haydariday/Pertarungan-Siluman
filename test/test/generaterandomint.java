/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Deking
 */
public class generaterandomint {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        double random = 0;
        int i = 0;
        System.out.println(Math.ceil(1.5));
        long startTime = System.currentTimeMillis();
        while (i != 20){
            random = ThreadLocalRandom.current().nextInt(10, 11);
            System.out.println(random);
            Thread.sleep(Math.max(0, 200));
            i++;
        }
    }
}
