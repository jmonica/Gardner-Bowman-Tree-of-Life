
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.GameControl;
import byui.cit260.treeOfLife.control.MapControl;
import byui.cit260.treeOfLife.exceptions.MapControlException;
import byui.cit260.treeOfLife.model.ArmorShop;
import byui.cit260.treeOfLife.model.InventoryItem;
import byui.cit260.treeOfLife.model.Location;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
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


      /*@Override
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
    }*/

    /*prompt to do individual assignment for week11
    private void viewCharacters() {
        String value;
    
        //prompt user to enter file path where they want to print the report
        do{
            this.console.println(this.promptMessage);
            value=this.getInput();
        }while (!value.equals("E"));
        }
        
        //call the array to print out the description
        String Character[] = new String[3];
        
        //call function to print out each item in the array
        displayCharacters(String Character);
    }
    
    public void displayCharacter(Character){
        Iterable<Character> desriptions;
        
        for (Character description : desriptions){
             //display the description of each character in the list
             System.out.println(Character.ordinal()+":"+description);             
         }
    }
    
    public String getInput(){
        boolean valid = faulse;
        String value = null;
        
        while (!valid){
            try{
                System.out.println("Where do you want to print the report?");
                
                value = this.keyboard.readln();

                if (value.length()<1){
                    ErrorView.display(this.getClass().getName(),
                            "Invalid file path");
                    continue;
                }
                break;
            } catch(IOException e)
                ErroeView.display(this.getClass().getName()
                        "Error reading input:"+e.getMessage());
                return null;
        }
    }*/

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
        //display the armor shop menu
        ArmorShop armorShop = new ArmorShopView();
        armorShop.display();
    }

    private void goToTemple() {
        System.out.println("goToTemple Function Called");
    }

   
            
}
