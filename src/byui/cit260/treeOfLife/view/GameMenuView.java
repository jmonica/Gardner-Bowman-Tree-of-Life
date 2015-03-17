
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.GameControl;
import byui.cit260.treeOfLife.model.InventoryItem;

public class GameMenuView extends View{

    public GameMenuView() {
        super("\n"
            +"\n----------------------------------------------------"
            +"\n| Begin Game Menu                                  |"
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

    private void displayMap() {
        System.out.println("displayMap Function called");
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