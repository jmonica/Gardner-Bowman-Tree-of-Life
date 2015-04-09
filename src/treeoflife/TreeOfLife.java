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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author MonicasApple
 */
public class TreeOfLife {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        try {
            //open character stream files for end user input and output
            TreeOfLife.inFile =
                    new BufferedReader (new InputStreamReader(System.in));
            
            TreeOfLife.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            TreeOfLife.logFile = new PrintWriter(filePath);
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            try{
            startProgramView.startProgram();
            } catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        } catch(Exception e){
            System.out.println("Exception:" + e.toString() +
                                "\nCause:" + e.getCause() +
                                "\nMessage:" + e.getMessage());
            
        }
        
        finally {
            try {
                if(TreeOfLife.inFile != null)
                    TreeOfLife.inFile.close();
                
                if(TreeOfLife.outFile != null)
                    TreeOfLife.outFile.close();
                
                if(TreeOfLife.logFile != null)
                    TreeOfLife.logFile.close();
                
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
        
        
       
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TreeOfLife.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TreeOfLife.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TreeOfLife.logFile = logFile;
    }
    
}