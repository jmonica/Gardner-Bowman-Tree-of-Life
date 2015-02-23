/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import java.util.Scanner;

/**
 *
 * @author gradygb
 */
public class GameMenuView {
    private final String MENU = "\n"
            +"\n----------------------------------------------------"
            +"\n| Begin Game Menu                                  |"
            +"\n----------------------------------------------------"
            +"\nC - Choose Character                                "
            +"\nQ - Quit                                            "
            +"\n----------------------------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);//display the existing game menu
            
            String input =this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of the string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E');
        
    }

    private String getInput() {
        boolean valid = false;
        String getInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            //prompt for the selection
            System.out.println("Make your selection");
            
            //get the selection from the keyboard and trim off the blanks
            getInput = keyboard.nextLine();
            getInput = getInput.trim();
            
            //if the selection is invalid
            if (getInput.length() != 1) {
                System.out.println("Invalid selection");
                continue;
            }
            break;
        }
          return getInput;
    }

    private void doAction(char selection) {
         switch (selection) {
             case 'C':
                 this.characterSelection();
                 break;
             case 'Q':
                 return;
             default:
                 System.out.println("\n*** Invalid selection ***");
                 break;
         }
    }

    private void characterSelection() {
        System.out.println("**** characterSelection function called");
    }
            
}