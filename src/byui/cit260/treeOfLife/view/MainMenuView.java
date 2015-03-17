/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.GameControl;
import treeoflife.TreeOfLife;

/**
 *
 * @author MonicasApple
 */
public class MainMenuView extends View {
   
    public MainMenuView() {
        super( "\n"
            +"\n----------------------------------"
            +"\n| Main Menu                      |"
            +"\n----------------------------------"
            +"\nB - Begin Game"
            +"\nG - Start existing game"
            +"\nH - To see help options on game play"
            +"\nL - Location Menu"
            +"\nS - Save Game"
            +"\nE - Exit"
            +"\n----------------------------------");
    }
    
        @Override
    public boolean doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (value) {
            case "B":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "L":
                this.location();
                break;
            case "E":
                return true;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
        }
        return true;
    }

  
    private void startNewGame() {
        GameControl.createNewGame(TreeOfLife.getPlayer()); //create a new game
        
        //display the game menu
        CharacterMenuView characterMenu = new CharacterMenuView();
        characterMenu.displayMenu();
    }
    private void startExistingGame() {
       GameControl.startExistingGame(TreeOfLife.getPlayer()); //start an existing game

        //display the option to choose from existing games
        ExistingGameView existingGame = new ExistingGameView();
        existingGame.displayMenu();
        
    }
    private void displayHelpMenu() {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
        
    }

    private void saveGame() {
       GameControl .saveGame(TreeOfLife.getPlayer()); // save the game
       
       //display the saveGame menu
       SaveMenuView saveMenu = new SaveMenuView();
       saveMenu.display();
    }

    private void location() {
        LocationView location = new LocationView();
        location.display();
    }

}
