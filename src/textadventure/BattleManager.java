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
public class BattleManager {
    public Party party;
    public ArrayList<Monster> monsterParty = new ArrayList<Monster>();
    
    public BattleManager(Party party) {
        this.party = party;
    }
    
    public void addMonsterToFight(Monster monster) {
        monsterParty.add(monster);
    }
    
    public void fight() {
        
    }
}