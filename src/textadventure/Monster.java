/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

/**
 *
 * @author Michael
 */
public class Monster {
    public String name;
    public int hp, mp, str, con, mag;
    
    public String describe() {
        return "The " + name + " has " + hp + " hp and " + mp + " mp!";
    }
    
    public void attack(Character c) {
    }
    
    public String say(String s) {
        return name + " says " + s;
    }
}