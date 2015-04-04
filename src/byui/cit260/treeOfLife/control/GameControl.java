package byui.cit260.treeOfLife.control;

import byui.cit260.treeOfLife.control.MapControl.SceneType;
import byui.cit260.treeOfLife.exceptions.MapControlException;
import byui.cit260.treeOfLife.model.Constants;
import byui.cit260.treeOfLife.model.Game;
import byui.cit260.treeOfLife.model.InventoryItem;
import byui.cit260.treeOfLife.model.Location;
import byui.cit260.treeOfLife.model.Map;
import byui.cit260.treeOfLife.model.Player;
import byui.cit260.treeOfLife.model.Scene;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import treeoflife.TreeOfLife;

public class GameControl {

    public static void createNewGame(Player player) throws MapControlException {
        Game game = new Game(); //create new game
        TreeOfLife.setCurrentGame(game); // save in treeOfLife

        game.setPlayer(player); // save player in game
        
        
        //create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in the game

        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }
   
    

    
     public static void saveGame(Game game, String filePath) 
        throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game object out to file
        } catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static InventoryItem[] getSortedInventoryList() {
        //get inventory list for the current game
        InventoryItem[] originalInventoryList=
                TreeOfLife.getCurrentGame().getInventory();
        
        //clone original list
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        //using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for(int i = 0; i< inventoryList.length-1; i++){
            for(int j = 0; j< inventoryList.length-1-i; j++){
                if(inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j+1].getDescription())>0){
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }

    public static void getSavedGame(String filePath)
        throws GameControlException{
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();//read the game object from file
        }
        catch(FileNotFoundException fnfe){
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        //close the output file
        TreeOfLife.setCurrentGame(game);//save in TreeOfLife
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        
        Location[][] locations = map.getLocations();
        //temple
        locations[0][0].setScene(scenes[SceneType.temple.ordinal()]);
        locations[0][0].setVisited(true);
        locations[0][0].setBlocked(false);
       
        //start
        locations[0][1].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setVisited(true);
        locations[0][1].setBlocked(false);
        
        //not blocked scenes
        
        //forest
        locations[1][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][0].setVisited(true);
        locations[0][1].setBlocked(false);
        //river
        locations[1][2].setScene(scenes[SceneType.river.ordinal()]);
        locations[1][2].setVisited(true);
        locations[0][1].setBlocked(false);
        //mountain
        locations[1][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[1][4].setVisited(true);
        locations[0][1].setBlocked(false);
        
        
        //blocked scenes
        //building
        locations[1][0].setScene(scenes[SceneType.building.ordinal()]);
        locations[1][0].setVisited(false);
        locations[1][0].setBlocked(true);
        
        //knowledge
        locations[4][1].setScene(scenes[SceneType.knowledge.ordinal()]);
        locations[4][1].setVisited(false);
        locations[4][1].setBlocked(true);
        
        //Tree of Live
        locations[2][2].setScene(scenes[SceneType.finish.ordinal()]);
        locations[2][2].setVisited(false);
        locations[2][2].setBlocked(true);
    }



    public enum Item {

        helmet,
        shield,
        belt,
        shod,
        sword,
        breastplate,
        rope;
    }

    public static InventoryItem[] createInventoryList() {
        //createed array(list) of inventory item
        InventoryItem[] inventory =
                new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];

        InventoryItem helmet = new InventoryItem();
        helmet.setDescription("-----Helmet of salvation------");
        helmet.setQuantityInStock(0);
        helmet.setRequiredAmount(5);
        inventory[Item.helmet.ordinal()] = helmet;

        InventoryItem shield = new InventoryItem();
        shield.setDescription("--------Shield of faith-------");
        shield.setQuantityInStock(0);
        shield.setRequiredAmount(5);
        inventory[Item.shield.ordinal()] = shield;

        InventoryItem belt = new InventoryItem();
        belt.setDescription("---------Belt of truth--------");
        belt.setQuantityInStock(0);
        belt.setRequiredAmount(2);
        inventory[Item.belt.ordinal()] = belt;

        InventoryItem shod = new InventoryItem();
        shod.setDescription("------Feet shod of peace------");
        shod.setQuantityInStock(0);
        shod.setRequiredAmount(2);
        inventory[Item.shod.ordinal()] = shod;

        InventoryItem sword = new InventoryItem();
        sword.setDescription("------Sword - word of God-----");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(5);
        inventory[Item.sword.ordinal()] = sword;

        InventoryItem breastplate = new InventoryItem();
        breastplate.setDescription("-Breastplate of righteousness-");
        breastplate.setQuantityInStock(0);
        breastplate.setRequiredAmount(3);
        inventory[Item.breastplate.ordinal()] = breastplate;

        InventoryItem rope = new InventoryItem();
        rope.setDescription("-------------Rope-------------");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(3);
        inventory[Item.rope.ordinal()] = rope;

        return inventory;
    }
    
    public void displayRequiredAmount(){
        int[] list = new int[7];
        
        //call function and pass arrays
        getRequiredAmount(list);
        String total = null;
        
        //display the total required faith to get all of the items
        System.out.println("Total faith you will need to buy all the items is" + total);
        
    }
    
    public int getRequiredAmount(int[] list) {
        int total = 0;
        
        for (int i=0; 0<list.length-1; i++){
            total = total + list[Item.belt.ordinal()];
        }
        return total;
    }
       
}


