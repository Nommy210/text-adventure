/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Party {
    protected int gold = 0;
    protected ArrayList<Item> items = new ArrayList<Item>();
    protected ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    protected ArrayList<Armor> armors = new ArrayList<Armor>();
    
    protected ArrayList<Character> members = new ArrayList<Character>();
    
    public void addMember(Character member) {
        members.add(member);
    }
    
    public void addItemToInventory(Item item) {
        items.add(item);
    }
    
    public void addWeaponToInventory(Weapon weapon) {
        weapons.add(weapon);
    }
        
    public void addArmorToInventory(Armor armor) {
        armors.add(armor);
    }
            
    public void addGold(int gold) {
        this.gold += gold;
    }
}
