
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.GameControl;
import byui.cit260.treeOfLife.model.InventoryItem;
import byui.cit260.treeOfLife.model.Location;
import treeoflife.TreeOfLife;

public class GameMenuView extends View{

    public GameMenuView() {
        super("\n"
            +"\n----------------------------------------------------"
            +"\n| Begin Game Menu                                  |"
            +"\n----------------------------------------------------"
            +"\nC - Choose Character                                "
            +"\nQ - Quit                                            "
            +"\n----------------------------------------------------");
    }


    private void characterSelection() {
        System.out.println("**** characterSelection function called");
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(Object obj) {
                
        String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (value) {
             case "C":
                 this.characterSelection();
                 break;
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
                 this.viewLocationsContet();
                 break;
             case "M":
                 this.moveToLocation();
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

    private void viewCharacters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewLocationsContet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveToLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewArmorShop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void goToTemple() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}