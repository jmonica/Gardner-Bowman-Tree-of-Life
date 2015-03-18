/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.control;

import byui.cit260.treeOfLife.exceptions.MapControlException;
import byui.cit260.treeOfLife.model.Game;
import byui.cit260.treeOfLife.model.Location;
import byui.cit260.treeOfLife.model.Map;
import byui.cit260.treeOfLife.model.Scene;
import java.awt.Point;
import treeoflife.TreeOfLife;

/**
 *
 * @author MonicasApple
 */
public class MapControl {

    public static Map createMap() {
       // create the map
        Map map = new Map(20, 20);
        
        //creat the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        MapControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    static void moveActorsToStartingLocation(Map map) 
            throws MapControlException {
        //for every character
        Character[] characters = Character.values();
        
        for (Character character : characters){
            Point coordinates = character.getCoordinates();
            MapControl.moveCharscterToLocation(character, coordinates);
        }
    }
    
    public static void moveCharscterToLocation(Character chsrscter, Point coordinates)
                            throws MapControlException{
        Map map = TreeOfLife.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow<0 || newRow>=map.getNoOfRows()||
                newColumn<0 || newColumn>=map.getNoOfColumns()){
            throw new MapControlException("Cannot move actor to location"
                                        + coordinates.x + "," + coordinates.y
                                        + "because thst location is outside"
                                        + "the bounds of the map.");  
        }
        
    }
    
    @Override
    public boolean doAction(String choice){
        Character character = null;
        Point coordinates = character.getCoordinates();
        //move character to specified location
        try {
            MapControl.moveCharscterToLocation(character, coordinates);          
        } catch(MapControlException me){
            System.out.println(me.getMessage());
        }
    }
  
    public enum SceneType {
        start,
        finish,
        river,
        forest,
        mountain,
        temple,
        knowledge,
        building;
    }
    private static Scene[] createScenes() {
        
        Game game = TreeOfLife.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                    "\nYou begin in your small thatched roof cottage in the"
                  + "woods. The Elder’s Scrolls are provided to you before you"
                  + "begin the challenge from the village elders. Here you will"
                  + "receive instruction and learn of the Tree of Life. The door"
                  + "opens and you take your first steps outside and enter the "
                  + "world of Ambrosia. \n" 
                  + "Choose wisely, build your faith and endure to the end!");
        startingScene.setSymbol(" ST ");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene ForestScene = new Scene();
        ForestScene.setDescription(
                    "\nYou made it to the forest. Try to gain enough faith to"
                  + "progress to the next scene by following instructions. \n");
        ForestScene.setSymbol(" ^^^ ");
        ForestScene.setBlocked(false);
        scenes[SceneType.forest.ordinal()] = ForestScene;
        
        Scene RiverScene = new Scene();
        RiverScene.setDescription(
                    "\nYou made it to the river. Try to gain enough faith to"
                  + "progress to the next scene by following instructions. \n");
        RiverScene.setSymbol(" ~~~ ");
        RiverScene.setBlocked(false);
        scenes[SceneType.river.ordinal()] = RiverScene;
        
        Scene MountainScene = new Scene();
        MountainScene.setDescription(
                    "\nYou made it to the mountain. Try to gain enough faith to"
                  + "progress to the next scene by following instructions. \n");
        MountainScene.setSymbol(" MMM ");
        MountainScene.setBlocked(false);
        scenes[SceneType.mountain.ordinal()] = MountainScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                    "\nCongratulations! Well done thou good and faithful servant."
                  + "You have had great faith and have reached the Tree of Life.");
        finishScene.setSymbol(" FN ");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
       return null;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        // start point
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.river.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.finish.ordinal()]);
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
}

