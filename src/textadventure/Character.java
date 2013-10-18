/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

/**
 *
 * @author Christopher
 */
public class Character {
    public String name;
    public int maxhp, hp, maxmp, mp, str, con, mag, atk, def;
    
    public void attack(Monster m) {
    }
    public String say(String s) {
        return name + "says, " +s;
    }
}
