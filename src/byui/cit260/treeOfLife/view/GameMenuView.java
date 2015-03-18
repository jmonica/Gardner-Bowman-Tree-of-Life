
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.GameControl;
import byui.cit260.treeOfLife.control.MapControl;
import byui.cit260.treeOfLife.exceptions.MapControlException;
import byui.cit260.treeOfLife.model.InventoryItem;
import byui.cit260.treeOfLife.model.Location;
import java.awt.Point;
import treeoflife.TreeOfLife;

public class GameMenuView extends View{

    public GameMenuView() {
        super("\n"
            +"\n----------------------------------------------------"
            +"\n|   Game Menu                                      |"
            +"\n----------------------------------------------------"
            +"\nV - Display Map                                     "
            +"\nA - View Character                                  "
            +"\nL - Location                                        " 
            +"\nM - Move to Location                                "
            +"\nH - Help                                            "
            +"\nP - Armor Shop                                      "    
            +"\nE - Exit                                            "
            +"\n----------------------------------------------------");
    }


    @Override
    public boolean doAction(Object obj) {
                
        String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (value) {
             
             case "V":
                 this.displayMap();
                 break;
             case "I":
                 this.viewPersonalInventory();
                 break;
             case "A":
                 this.viewCharacters();
                 break;
             case "L":
                 this.viewLocations();
                 break;
             case "M":
                 this.moveToLocation();
                 break;
             case "H":
                 this.displayHelpMenu();
                 break;
             case "P":
                 this.viewArmorShop();
                 break;
             case "T":
                 this.goToTemple();
                 break;
             case "E":
                 return true;
             default:
                 System.out.println("\n*** Invalid selection ***");
                 break;
         } 
        return true;
    }

     private void displayMap() {
        Location[][] location = TreeOfLife.getCurrentGame().getMap().getLocations();
        
        System.out.println("\nMap to the Tree of Life");
        System.out.println("Row" + "\t 1  2  3  4  5  6  7  8" +
                           "Column" + "\t");
        
        // for every column 
       for(int i = 0; i< TreeOfLife.getCurrentGame().getMap().getNoOfRows(); i++){
            System.out.println("\n***");
            System.out.println(i);
                for(int j = 0; j< TreeOfLife.getCurrentGame().getMap().getNoOfColumns(); j++){
                    System.out.print("\n\n|");
                    System.out.print(j);
                    Location locations = location [i][j];
                    if(locations.getVisited())
                        System.out.print("~~~~");
                    else 
                        System.out.println("\n\n??");
                               
                }
        }
        }


    private void viewPersonalInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                           "Required" + "\t"+
                           "In Stock");
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory){
            //DISPLAY the description, the required amount and amont in stock
            System.out.println(inventoryItem.getDescription() + "\t   " +
                               inventoryItem.getRequiredAmount() + "\t   " +
                               inventoryItem.getQuantitiyInStock());
        }
    }


      @Override
    public boolean doAction(String choice){
        Character character = null;
        Point coordinates = character.getCoordinates();
        //move character to specified location
        try {
            MapControl.moveCharacterToLocation(character, coordinates);          
        } catch(MapControlException me){
            System.out.println(me.getMessage());
        }
        return false;
    }

    private void viewCharacters() {
        System.out.println("viewCharacters called");
    }

    private void viewLocations() {
        System.out.println("viewLocations Function called");
    }

    private void moveToLocation() {
        System.out.println("moveToLocation Function called");
    }

    private void displayHelpMenu() {
         //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void viewArmorShop() {
        System.out.println("viewArmorShop Function Called");
    }

    private void goToTemple() {
        System.out.println("goToTemple Function Called");
    }

   
            
}