package treeoflife;

import byui.cit260.treeOfLife.model.ArmorShop;
import byui.cit260.treeOfLife.model.Game;
import byui.cit260.treeOfLife.model.Inventory;
import byui.cit260.treeOfLife.model.Map;
import byui.cit260.treeOfLife.model.PersonalInventory;
import byui.cit260.treeOfLife.model.Player;
import byui.cit260.treeOfLife.model.Scene;
import byui.cit260.treeOfLife.model.SceneTwo;
import byui.cit260.treeOfLife.model.Character;
import byui.cit260.treeOfLife.model.CharacterInventory;

/**
 *
 * @author MonicasApple
 */
public class TreeOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Game
        Game gameOne = new Game();
        
        gameOne.setTotalTime(7.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        //Scene One
        Scene sceneOne = new Scene();
        
        sceneOne.setType('a');
        sceneOne.setDescription("This is a forest");
        sceneOne.setSymbol('b');
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        SceneTwo sceneTwo = new SceneTwo();
        
        sceneTwo.setType('e');
        sceneTwo.setSymbol('f');
        sceneTwo.setDescription("this is scene two");
        sceneTwo.setBlocked('g');
        
        String sceneTwoInfo = sceneTwo.toString();
        System.out.println(sceneTwoInfo);
        
        //Armor Shop
        ArmorShop armorShop = new ArmorShop();
        
        armorShop.setInventoryType("Inventory type is armor");
        armorShop.setQuantityInStock(5);
        armorShop.setRequiredAmount(8);
        
        String armorInfo = armorShop.toString();
        System.out.println(armorInfo);
        
        //Inventory
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setInventoryType("Inventory type is a sword");
        inventoryOne.setQuantityInStock(1);
        inventoryOne.setRequiredAmount(3);
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        //Personal Inventory
        PersonalInventory personalOne = new PersonalInventory();
        
        personalOne.setInventoryType("This is personal inventory");
        personalOne.setMonyAmount(4);
        personalOne.setQuantityInStock(7);
        
        String personalInfo = personalOne.toString();
        System.out.println(personalInfo);
        
        //Map
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(20);
        mapOne.setColumnCount(12);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        //Character
        Character characterOne = new Character();
        
        characterOne.setName("Nephi");
        String characterInfo= characterOne.toString();
        System.out.println(characterInfo);
        
        //Character Info
        CharacterInventory characterInventoryOne = new CharacterInventory();
        
        characterInventoryOne.setInventoryType("This is your Personal Inventory");
        String characterInventoryInfo = characterInventoryOne.toString();
        System.out.println(characterInventoryInfo);
        
        //Location
        
        
        //Player
        Player playerOne = new Player();
        
        playerOne.setName("Hisami");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        }
        
    }
