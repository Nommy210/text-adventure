/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class TextAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        boolean gameRunning = true;
        
        print("Welcome to Text Adventure 64!");
        while (gameRunning) {
            // Display game information
            print ("You see a goblin!");
            
            // Play sound
            
            // Print menu
            printMenu();
            
            // Get input from player
            print("What would you like to do?");
            input = getInputFromKeyboard();
            
            // Procedss player input
            if (input.equals("quit")) {
                gameRunning = false;
            } else if (input.equals("use")) {
                print("You don't have any items!");
            } else if (input.equals("walk")) {
                print("Which direction?");
                input = getInputFromKeyboard();
                
                if (input.equals("north")) {
                    print("The goblin blocks your path!");
                    input = getInputFromKeyboard();
                } else if (input.equals("south")) {
                    print("The goblin blocks your path!");
                    input = getInputFromKeyboard();
                } else if (input.equals("east")) {
                    print("The goblin blocks your path!");
                    input = getInputFromKeyboard();
                } else if (input.equals("west")) {
                    print("The goblin blocks your path!");
                    input = getInputFromKeyboard();
                }
            } else if (input.equals("look")) {
                print("What do you want to look at?");
                input = getInputFromKeyboard();
                
                if (input.equals("goblin")) {
                    print("The goblin glares at you.");
                }
            } else if (input.equals("talk")) {
                print("What do you want to talk to?");
                input = getInputFromKeyboard();
                
                if (input.equals("goblin")) {
                    print("Goblin says, 'Herpety derpderp herpderp derp!'");
                    print("Retarded goblin dies.");
                }
            } else {
                print("I do not understand that command.");
            }
        }
    }
    
    public static void battleTest() {
        Party party = new Party();
        Character mike = new Character();
        Character jason = new Character();
        Monster orc = new Monster();
        Monster goblin = new Monster();
        
        party.addMember(mike);
        party.addMember(jason);
        
        BattleManager battle = new BattleManager(party);
        battle.addMonsterToFight(goblin);
        battle.addMonsterToFight(orc);
        
        battle.fight();
    }
    
    public static void printMenu() {
        System.out.println("Menu: use|walk|talk|look|quit");
    }
    
    public static void print(String s) {
        System.out.println(s);
    }
    
    public static String getInputFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}