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
        System.out.println("\n\n**************************************************");
                          
        System.out.println("*                                                *"
                       + "\n* Embark on a journey to reach the Tree of Life. *"
                       + "\n* It will require faith and the ability to stay  *"
                       + "\n* the course despite the hardships you encounter.*"
                       + "\n* You will need to aquire the Armor of God and   *"
                       + "\n* Shield of Faithe along the way to overcome the *"
                       + "\n* challenges ahead.                              *");
        
        System.out.println("*                                                *"
                       + "\n* Make sure you take the time to restore your    *"
                       + "\n* faith by visiting the temple often. Here you   *"
                       + "\n* will be strengthened in your faith. If you take*"
                       + "\n* a wrong turn or explore an area that takes you *"
                       + "\n* from your course, you have the chance to reset *"
                       + "\n* by praying at the mantle where you can repent  *"
                       + "\n* from your poor decisions. Be careful, if you   *"
                       + "\n* spend more time at the praying mantle, other   *"
                       + "\n* future opportunities may not present themselves*"
                       + "\n* later in your journey.                         *");
        
        System.out.println("*                                                *"
                        + "\n* The goal is to reach the tree of life, but     *"
                        + "\n* depending on your faith, you may find yourself *"
                        + "\n* stuck in the large and spacious building or at *"
                        + "\n* the Tree of Knowledge. The Tree of Knowledge   *"
                        + "\n* only grants you one gift and if you fail to    *"
                        + "\n* reach either tree, you will surley have been   *"
                        + "\n* lost in the spacious building.                 *"
                        + "\n*                                                *");
        System.out.println("**************************************************");

    }

    private void howToMove() {
        System.out.println("*** how function called ***");
    }
}
