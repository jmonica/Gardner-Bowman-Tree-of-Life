
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.ProgramControl;
import byui.cit260.treeOfLife.model.Player;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StartProgramView extends View{

    public StartProgramView() {
        super("\n\n**************************************************");
                          
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

    

    public void startProgram(){
   
        try {
            //display banner screen
            this.displayBanner();
            
            //prompt the player to enter their name Retrieve the name of the player
            String playersName = this.getPlayersName();
            
            //Create and save the player object
            Player player = ProgramControl.createPlayer(playersName);
            
            //Display a personalized welcome message
            this.displayWelcomeMessage(player);
            
            //Display the Main Menu
            MainMenuView mainMenu = new MainMenuView();
            mainMenu.display();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }

    
    }
    
    public void displayBanner() {
        System.out.println();

    }

    public String getPlayersName() throws IOException {
        boolean valid = false;
        String playersName = null;
        
        
        while(!valid){
        
        //prompt for the players name
        this.console.println("Enter the player's name below");
        
        //get the name from the keyboard and trim off the blanks
        playersName = keyboard.readLine();
        playersName = playersName.trim();
        
        //if the name is invalied (less than two character in length)
        if(playersName.length() < 2){
          ErrorView.display(this.getClass().getName(), "Invalid name - the name must not be blank");
          continue; //and repeat again
        }
        break; //out of the (exit) the repetition
        }
        
    return playersName; //return the name
    
    }

    public void displayWelcomeMessage(Player player) {
        this.console.println("\n\n===================================");
        this.console.println("\tWelcome to the game " + player.getName());
        this.console.println("\tWe hope you have a lot of fun!");
        this.console.println("===================================");
    }
    
    
    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
