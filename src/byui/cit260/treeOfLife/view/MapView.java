/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.MapControl;
import byui.cit260.treeOfLife.exceptions.MapControlException;
import byui.cit260.treeOfLife.model.Location;
import java.awt.Point;
import treeoflife.TreeOfLife;

/**
 *
 * @author MonicasApple
 */
public class MapView extends View{
    public MapView(){    
        super("\n"
                + "\n********************************************"
                + "\n|         MAP                              |"
                + "\n********************************************"
                + "\nC - Enter Map Coordinates"
                + "\nM - View Map"
                + "\nG - Got Back to Game Menu"
                + "\n********************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered
        switch (choice) {
            case 'C':
                this.enterCoordinates();
                break;
            case 'G':
                this.gameMenu();
                break;
            case 'M':
                this.viewMap();
            default:
                ErrorView.display("MapView", "\n *** Invalied map selections *** Try again");
                break;
        } 
        return true;
    }

    private void enterCoordinates() {
        this.console.println("\n Enter the Coordinates to move to a different location."
                + "\nFirst enter the row number and then the column number "
                + "\nExample 0,1 is your starting location.");
        
        String value = this.getInput();
            if(value.indexOf(",")== -1){
                ErrorView.display("MapView", "\n *** Invalied map selections *** Try again");
            }else{
                String[] values = value.split("\\s*,\\s*");
                try{
                    int x = Integer.parseInt(values[0]);
                    int y = Integer.parseInt(values[1]);
            if (x < 0 || x > TreeOfLife.getCurrentGame().getMap().getNoOfRows()){
               ErrorView.display("MapView", "\n *** Invalied map selections *** Try again"); 
               return;
            } 
            if (y < 0 || y > TreeOfLife.getCurrentGame().getMap().getNoOfColumns()){
               ErrorView.display("MapView", "\n *** Invalied map selections *** Try again"); 
               return;
            }
            Location location = TreeOfLife.getCurrentGame().getMap().getLocations()[x][y];
            if(location.isBlocked() == true){
                ErrorView.display("MapView", "You can't go here yet."
                        + "Please choose another location");
            
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMap();
            }
            else{
                MapControl.moveCharactersToLocation(TreeOfLife.getCurrentGame().getCharacter(), new Point(x,y));
                
                Location[][] locations = TreeOfLife.getCurrentGame().getMap().getLocations();
                Location currentLocation = locations[x][y];
                
                String description = currentLocation.getScene().getDescription();
                this.console.println(description);
                
 
            }
            
    }       catch (MapControlException ex) {
                ErrorView.display("MapView", ex.getMessage());
 
            }
    }
}

    private void gameMenu() {
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
    }

    private void viewMap() {
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMap();
    }
   
}
