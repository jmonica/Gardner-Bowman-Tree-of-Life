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
class SaveMenuView extends View{
    
    public final String MENU = "\n"
            +"\n----------------------------------------------------"
            +"\n| Save Game Menu                                   |"
            +"\n----------------------------------------------------"
            +"\nA - Save Game                                       "
            +"\nE - Exit                                            "
            +"\n----------------------------------------------------";
            
            public void displayMenu() {
                char selection = ' ';
                do {
                    System.out.println(MENU);//display the save game menu
                    
                    String input = this.getInput(); //get the user's selection
                    selection = input.charAt(0); //get first character of the string
                    
                    this.doAction(selection); //do action based on selection
                  
                } while (selection != 'E');
            }

    private String getInput() {
        boolean valid = false;
        String getInput = null;
        Scanner keyboard = new Scanner (System.in);
        
        while (!valid) {
            System.out.println("Choose your action");
            
            getInput = keyboard.nextLine();
            getInput = getInput.trim();
            
            if (getInput.length() != 1) {
                System.out.println("Invalid selection");
                continue;
            } 
            break;
        }
        return getInput;
    }

    private void doAction(char selection) {
        switch (selection){
            case 'A':
                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection ***");
                break;
        }
    }

    private void saveGame() {
                System.out.println("**** saveGame function called");
    }
}
