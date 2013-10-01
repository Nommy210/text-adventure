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
                print("What item?");
                
                if (input.equals(input)) {
                    print("You don't have any items!");
                    print("What would you like to do?");
                    input = getInputFromKeyboard();
                }
            } else if (input.equals("walk")) {
                print("Which direction?");
                input = getInputFromKeyboard();
                
                if (input.equals("north")) {
                    print("The goblin blocks your path!");
                    print("What would you like to do?");
                    input = getInputFromKeyboard();
                    } else if (input.equals("south")) {
                        print("The goblin blocks your path!");
                        print("What would you like to do?");
                        input = getInputFromKeyboard();
                    } else if (input.equals("east")) {
                        print("The goblin and orc block your path!");
                        print("What would you like to do?");
                        input = getInputFromKeyboard();
                    } else if (input.equals("west"));
                        print("The goblin and orc block your path!");
                        print("What would you like to do?");
                        input = getInputFromKeyboard();
                        { 
                }
            } else if (input.equals("look")) {
                print("What do you want to look at?");
                input = getInputFromKeyboard();
                
                if (input.equals("goblin")) {
                    print("The goblin glares at you.");
                    print("What would you like to do?");
                    input = getInputFromKeyboard();
                    if (input.equals("talk")) {
                        print("Goblin says, 'Herpety derpderp herpderp derp!'");
                        print("Retarded goblin dies.");
                        if (input.equals("look")) {
                            print("You find a knife on the retarded goblin.");
                        }
                        
                    }
                }
            } if (input.equals(input));{
                print("I do not understand that command.");
                input = getInputFromKeyboard();
        }
        }
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