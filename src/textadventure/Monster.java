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
    public int hp, mp, str, def, mag;
    
    public String describe() {
        return "The " + name + " has " + hp + " hp and " + mp + " mp!";
    }
    
    public void attack(Monster m) {
        
    }
    
    public String say(String s) {
        return name + " says " + s;
    }
}