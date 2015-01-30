/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeoflife;

import byui.cit260.treeOfLife.model.ArmorShop;
import byui.cit260.treeOfLife.model.Game;
import byui.cit260.treeOfLife.model.Inventory;
import byui.cit260.treeOfLife.model.PersonalInventory;
import byui.cit260.treeOfLife.model.Scene;

/**
 *
 * @author MonicasApple
 */
public class TreeOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        
        gameOne.setTotalTime(7.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    
        Scene sceneOne = new Scene();
        
        sceneOne.setType('a');
        sceneOne.setDescription("This is a forest");
        sceneOne.setSymbol('b');
        sceneOne.setBlocked('c');
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        ArmorShop armorShop = new ArmorShop();
        
        armorShop.setInventoryType("Inventory type is armor");
        armorShop.setQuantityInStock(5);
        armorShop.setRequiredAmount(8);
        
        String armorInfo = armorShop.toString();
        System.out.println(armorInfo);
        
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setInventoryType("Inventory type is a sword");
        inventoryOne.setQuantityInStock(1);
        inventoryOne.setRequiredAmount(3);
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        PersonalInventory personalOne = new PersonalInventory();
        
        personalOne.setInventoryType("This is personal inventory");
        personalOne.setMonyAmount(4);
        personalOne.setQuantityInStock(7);
        
        String personalInfo = personalOne.toString();
        System.out.println(personalInfo);
        }
}
