
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.GameControl;
import byui.cit260.treeOfLife.control.GameControlException;
import byui.cit260.treeOfLife.model.Character;
import byui.cit260.treeOfLife.model.FaithMeter;
import byui.cit260.treeOfLife.model.Game;
import byui.cit260.treeOfLife.model.InventoryItem;
import byui.cit260.treeOfLife.model.Location;
import byui.cit260.treeOfLife.model.Scene;
import java.awt.Point;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import treeoflife.TreeOfLife;

public class GameMenuView extends View{

    public GameMenuView() {
        super("\n----------------------------------------------------"
            +"\n|   Game Menu                                      |"
            +"\n----------------------------------------------------"
            +"\nV - Display Map"
            +"\nI - Personal Inventory"
            +"\nF - Display Faith Points"    
            +"\nL - Location" 
            +"\nM - Move to Location"
            +"\nH - Help"
            +"\nT - Temple"    
            +"\nP - Armor Shop"    
            +"\nE - Exit"
            +"\n----------------------------------------------------");
    }


    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
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
            case 'C':
        {
            try {
                this.viewCharacters();
            } catch (GameControlException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 'F':
                this.getFaith();
            case 'E':
                this.goBack();
            default:
                this.console.println("\n*** Invalid selection ***");
                break;
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
        for(int j = 0; j <locations[i].length; j++){
            Location location = locations[i][j];
            
            String symbol;
            
            Point currentCoordinates= TreeOfLife.getCurrentGame().getCharacter().getCoordinates();
            Location characterLocation = locations[currentCoordinates.x][currentCoordinates.y];
            
            if(location == characterLocation){
                symbol = "HERE";
            }
            else if (location.getVisited()) {
                
                Scene scene = location.getScene();
                symbol = scene.getSymbol();
            }
            else{
                symbol = " ??? ";
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
        
        for (InventoryItem inventoryItem : inventory){
            //DISPLAY the description, the required amount and amont in stock
            this.console.println(inventoryItem.getDescription() + "--------------" +
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

    public static void viewCharacters() 
        throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream("C:\\Users\\gradygb\\Desktop\\TreeOfLife\\treeOfLife.txt")) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(Character.Nephi.getDescription());
            output.writeObject(Character.Laman.getDescription());
            output.writeObject(Character.Sam.getDescription());//write the game object out to file
        } catch(IOException e) {
            throw new GameControlException(e.getMessage());
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
        LocationView locationView = new LocationView();
        locationView.display();
    }

    private void moveToLocation() {
        MapView mapMenu = new MapView();
        mapMenu.display();
    }

    private void displayHelpMenu() {
         //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void viewArmorShop() {
        //display the armor shop menu
        ArmorShopView armorShop = new ArmorShopView();
        armorShop.doAction(this);
    }

    private void goToTemple() {
        TempleView templeView = new TempleView();
        templeView.display();
    }

//    private String displayFaithPoints() {
//        CharacterMenuView characterFaith = new CharacterMenuView();
//        characterFaith.display();
//        return null;
//        
//    }

    private void getFaith() {
        FaithMeterView faithMeter = new FaithMeterView();
        faithMeter.getFaithCurrent();
    }

    private void goBack() {
        CharacterMenuView choose = new CharacterMenuView();
        choose.display();
    }

//    private void mapMenu() {
//        MapView mapMenu = new MapView();
//        mapMenu.display();
//    }

   
            
}
