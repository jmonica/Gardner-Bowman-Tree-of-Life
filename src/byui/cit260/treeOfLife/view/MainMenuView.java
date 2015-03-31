/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.GameControl;
import byui.cit260.treeOfLife.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        {
            try {
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
            case "E":
                return true;
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
        }
        return true;
    }

  
    private void startNewGame() throws MapControlException {
        GameControl.createNewGame(TreeOfLife.getPlayer()); //create a new game
        
        //display the game menu
        CharacterMenuView characterMenu = new CharacterMenuView();
        characterMenu.display();
    }
    private void startExistingGame() {
       //prompt for and get the name of the file to save the game in
         this.console.println("\n\nEnter the file path for file where the game"
                            + "is to be saved");
        String filePath = this.getInput();
        
        try {
        GameControl.getSavedGame(filePath); //start an existing game
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

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
        //prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for file where the game"
                            + "is to be saved");
        String filePath = this.getInput();
        
        try {
        GameControl .saveGame(TreeOfLife.getCurrentGame(), filePath); // save the game
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
       
       //display the saveGame menu
       SaveMenuView saveMenu = new SaveMenuView();
       saveMenu.display();
    }


}
