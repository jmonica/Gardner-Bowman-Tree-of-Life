package byui.cit260.treeOfLife.control;

import byui.cit260.treeOfLife.model.Game;
import byui.cit260.treeOfLife.model.InventoryItem;
import byui.cit260.treeOfLife.model.Map;
import byui.cit260.treeOfLife.model.Player;
import treeoflife.TreeOfLife;

public class GameControl {

    public static void createNewGame(Player player) {
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

    public static void startExistingGame(Player player) {
        System.out.println("\n*** startExistingGame stub function called");
    }

    public static void saveGame(Player player) {
        System.out.println("\n*** saveMenu stub function called");
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

    private static InventoryItem[] createInventoryList() {
        //createed array(list) of inventory item
        InventoryItem[] inventory =
                new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];

        InventoryItem helmet = new InventoryItem();
        helmet.setDescription("Helmet of salvation");
        helmet.setQuantityInStock(0);
        helmet.setRequiredAmount(0);
        inventory[Item.helmet.ordinal()] = helmet;

        InventoryItem shield = new InventoryItem();
        shield.setDescription("Shield of faith");
        shield.setQuantityInStock(0);
        shield.setRequiredAmount(0);
        inventory[Item.shield.ordinal()] = shield;

        InventoryItem belt = new InventoryItem();
        belt.setDescription("Belt of truth");
        belt.setQuantityInStock(0);
        belt.setRequiredAmount(0);
        inventory[Item.belt.ordinal()] = belt;

        InventoryItem shod = new InventoryItem();
        shod.setDescription("Feet shod of peace");
        shod.setQuantityInStock(0);
        shod.setRequiredAmount(0);
        inventory[Item.shod.ordinal()] = shod;

        InventoryItem sword = new InventoryItem();
        sword.setDescription("Sword - word of God");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[Item.sword.ordinal()] = sword;

        InventoryItem breastplate = new InventoryItem();
        breastplate.setDescription("Breastplate of righteousness");
        breastplate.setQuantityInStock(0);
        breastplate.setRequiredAmount(0);
        inventory[Item.breastplate.ordinal()] = breastplate;

        InventoryItem rope = new InventoryItem();
        rope.setDescription("Rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        inventory[Item.rope.ordinal()] = rope;

        return inventory;
    }
}
