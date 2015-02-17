/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import java.util.Scanner;

/**
 *
 * @author MonicasApple
 */
public class MainMenuView {

    private final String MENU = "\n"
            +"\n----------------------------------"
            +"\n| Main Menu                      |"
            +"\n----------------------------------"
            +"\nB - Begin Game"
            +"\nG - Start existing game"
            +"\nH - To see help options on game play"
            +"\nS - Save Game"
            +"\nE - Exit"
            +"\n----------------------------------";
    public void displayMenu() {
        char selection = ' ';
        do{
        System.out.println(MENU); //display main menu
        
        String input = this.getInput(); //get the user's selection
        selection = input.charAt(0); //get first character of string
        
        this.doAction(selection); //do action based on selection
        
        }while (selection != 'E'); //an selction is not "Exit"
    }

    public void doAction(char choice) {
        switch (choice) {
            case 'B':
                this.startNewGame();
                break;
            case 'G':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
        }
    }

  
    private void startNewGame() {
       System.out.println("*** startNewGame function called");  
    }
    private void startExistingGame() {
       System.out.println("*** startExistingGame function called");
    }
    private void displayHelpMenu() {
       System.out.println("*** displayHelpMenu function called"); 
    }

    private void saveGame() {
       System.out.println("*** saveGame function called");  
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
        if(getInput() != 'B'){
          System.out.println("Invalid selection");
          
        }
        else if(getInput () !='G'){
            System.out.println("Invalid selection");
           
        }
        else if(getInput () !='H'){
            System.out.println("Invalid selection");
            
        }
        else if(getInput () !='S'){
            System.out.println("Invalid selection");
            
        }
        else if(getInput () !='E'){
            System.out.println("Invalid selection");
           
        }
        


