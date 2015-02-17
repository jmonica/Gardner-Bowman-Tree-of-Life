package treeoflife;

//import byui.cit260.treeOfLife.model.ArmorShop;
//import byui.cit260.treeOfLife.model.Game;
//import byui.cit260.treeOfLife.model.Inventory;
//import byui.cit260.treeOfLife.model.Map;
//import byui.cit260.treeOfLife.model.PersonalInventory;
//import byui.cit260.treeOfLife.model.Player;
//import byui.cit260.treeOfLife.model.Scene;
//import byui.cit260.treeOfLife.model.SceneTwo;
//import byui.cit260.treeOfLife.model.Character;
//import byui.cit260.treeOfLife.model.CharacterInventory;
//import byui.cit260.treeOfLife.model.Location;
import byui.cit260.treeOfLife.model.Game;
import byui.cit260.treeOfLife.model.Player;
import byui.cit260.treeOfLife.view.StartProgramView;

/**
 *
 * @author MonicasApple
 */
public class TreeOfLife {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
       
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TreeOfLife.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TreeOfLife.player = player;
    }
    
}