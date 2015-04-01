
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.GameControl;
import byui.cit260.treeOfLife.model.ArmorShop;
import byui.cit260.treeOfLife.model.InventoryItem;
import byui.cit260.treeOfLife.model.Location;
import byui.cit260.treeOfLife.model.Scene;
import java.awt.Point;
import java.io.IOException;

import treeoflife.TreeOfLife;

public class GameMenuView extends View{

    public GameMenuView() {
        super("\n----------------------------------------------------"
            +"\n|   Game Menu                                      |"
            +"\n----------------------------------------------------"
            +"\nV - Display Map"
            +"\nI - Personal Inventory"    
            +"\nL - Location" 
            +"\nM - Move to Location"
            +"\nH - Help"
            +"\nP - Armor Shop"    
            +"\nE - Exit"
            +"\n----------------------------------------------------");
    }


    @Override
    public boolean doAction(Object obj) {
        
        try {
            String value = keyboard.readLine();
            
            value = value.toUpperCase();//convert to all upper case
            char choice = value.charAt(0); //get the first character entered
            
//        String value = (String)obj;
//        
//        value = value.toUpperCase();//convert to all upper case
//        char choice = value.charAt(0); //get the first character entered
            
            switch (choice) {
                
                case 'V':
                    this.displayMap();
                    break;
                case 'I':
                    this.viewPersonalInventory();
                    break;
                case 'L':
                    this.viewLocations();
                    break;
                case 'M':
                    this.moveToLocation();
                    break;
                case 'H':
                    this.displayHelpMenu();
                    break;
                case 'P':
                    this.viewArmorShop();
                    break;
                case 'T':
                    this.goToTemple();
                    break;
                case 'E':
                    return true;
                default:
                    this.console.println("\n*** Invalid selection ***");
                    break;
            }
            return true;
        } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        return false;
        
        
    }

     public void displayMap() {
        Location[][] locations = TreeOfLife.getCurrentGame().getMap().getLocations();
        //Title display
        System.out.println("\n |******Map to the Tree of Life*****|");
        
        //Row and column display
        System.out.println("\n |   0  |   1  |   2  |   3  |   4  |");
        for(int i = 0; i < locations.length; i++){
            
            System.out.println("-----------------------------------------");
        
        String grid = i + "|";
        for(int j = 0; j<locations[i].length; j++){
            Location location = locations[i][j];
            
            String symbol = null;
            
            Point currentCoordinates= TreeOfLife.getCurrentGame().getCharacter().getCoordinates();
            Location characterLocation = locations[currentCoordinates.x][currentCoordinates.y];
            
            if(location == characterLocation){
                symbol = "HERE";
            }
            else if (location.getVisited() ) {
                
                Scene scene = location.getScene();
                scene.setSymbol(symbol);
            }
            else{
                symbol = "????";
            }
            grid += (" "+symbol +" |");
        }
        System.out.println(grid);
        }
        
        }
 

    private void viewPersonalInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        this.console.println("\n----------------------------------------------------");
        this.console.println("|      List of Inventory Items                     |");
        this.console.println("----------------------------------------------------");
        this.console.println("Description" + "\t                    " +
                           "How Many You Have");
        this.console.println("     ");
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory){
            //DISPLAY the description, the required amount and amont in stock
            this.console.println(inventoryItem.getDescription() + "  --------------------------" +
                               inventoryItem.getQuantitiyInStock());
        }
    }


//      //@Override
//    public boolean doAction(String choice){
//        Character character = null;
//        Point coordinates = character.getCoordinates();
//        //move character to specified location
//        try {
//            MapControl.moveCharacterToLocation(character, coordinates);          
//        } catch(MapControlException me){
//            System.out.println(me.getMessage());
//        }
//        return false;
//    }

    //prompt to do individual assignment for week11
    private void viewCharacters() {
        String value;
    
        //prompt user to enter file path where they want to print the report
        do{
            this.console.println(this.promptMessage);
            value=this.getInput();
        }while (!value.equals("E"));        
        
        //call the array to print out the description
        String[] character = new String[3];
        
        //call function to print out each item in the array
        displayCharacter();
    }
    
    public void displayCharacter(){
        Iterable<Character> descriptions = null;
        
        for (Character description : descriptions){
             //display the description of each character in the list
             System.out.println(descriptions);             
         }
    }
    
    //@Override
    public String getReportInput(){
        boolean valid = false;
        String value = null;
        
        while (!valid){
            try{
                System.out.println("Where do you want to print the report?");
                
                value = this.keyboard.readLine();

                if (value.length()<1){
                    ErrorView.display(this.getClass().getName(),
                            "Invalid file path");
                    continue;
                }
                break;
            } catch(IOException e){
                ErrorView.display(this.getClass().getName(),
                        "Error reading input:"+e.getMessage());
                return null;
        }
    }
        return value;
}        

    private void viewLocations() {
        this.displayMap();
    }

    private void moveToLocation() {
        this.console.println("moveToLocation Function called");
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
        this.console.println("goToTemple Function Called");
    }

   
            
}
