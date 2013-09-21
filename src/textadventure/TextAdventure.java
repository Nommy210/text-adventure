/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textadventure;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class TextAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        boolean gameRunning = true;
        
        print("Welcome to text adventure 64!");
        while (gameRunning) {
            // Display game information
            print ("You see an orc and a goblin!");
            
            // Play sound
            
            // Print menu
            printMenu();
            
            // Get input from player
            print("What would you like to do?");
            input = getInputFromKeyboard();
            
            // Process player input
            if (input.equals("quit")) {
                gameRunning = false;
            } else if (input.equals("use")) {
                print("What item?");
            } else if (input.equals("walk")) {
                print("Which direction?");
            } else if (input.equals("look")) {
                print("What do you want to look at?");
                input = getInputFromKeyboard();
                
                if (input.equals("goblin")) {
                    
                } else if (input.equals("orc")) {
                    
                }
            }
        }
    }
    
    public static void printMenu() {
        System.out.println("Menu: use|walk|look|quit");
    }
    
    public static void print(String s) {
        System.out.println(s);
    }
    
    public static String getInputFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}