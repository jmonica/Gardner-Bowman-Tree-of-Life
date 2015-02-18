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
public class HelpMenuView {

    private final String MENU = "\n"
            +"\n----------------------------------------------------"
            +"\n| Help Menu                                        |"
            +"\n----------------------------------------------------"
            +"\nG - What is the goal of the game?"
            +"\nM - How to move?"
            +"\nQ - Quit"
            +"\n----------------------------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
        
        System.out.println(MENU); //display the help menu
        
        String input = this.getInput(); //get the usesr's selection
        selection = input.charAt(0); // get firt character of string
        
        this.doAction(selection); // do action based on selection
        
        } while (selection != 'Q'); // an selection is not "Quit"
    }

      public String getInput() {
        boolean valid = false;
        String getInput = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
        
        //prompt for the selection
        System.out.println("Choose your selection");
        
        //get the selection from the keyboard and trim off the blanks
        getInput = keyboard.nextLine();
        getInput = getInput.trim();
        
        //if the selection is invaled 
        if (getInput.length() != 1){
            System.out.println("Invalid selection");
            continue;
        }
        break;
        }
        return getInput;
    }

    private void doAction(char selection) {
        
        switch (selection) {
            case 'G':
                this.gameInstruction();
                break;
            case 'M':
                this.howToMove();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection ***");
                break;
        }
    }

    private void gameInstruction() {
        System.out.println("*** gameInstruction function called ***");
    }

    private void howToMove() {
        System.out.println("*** gameInstruction function called ***");
    }
}
