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
public interface Levelable {
    public double getExp();
    public void gainExp(double i);
    public double giveExp();
    public void levelUp();
    public void setLevel(int i);
    public int getLevel();
}
