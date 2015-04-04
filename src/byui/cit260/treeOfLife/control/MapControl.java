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
import byui.cit260.treeOfLife.model.Character;
import java.io.Serializable;

/**
 *
 * @author MonicasApple
 */
public class MapControl {

    public static Map createMap() {
       // create the map
        Map map = new Map(5, 5);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to locations on map
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
        public enum SceneType implements Serializable{
        start("Starting Point in the Game"),
        finish("Tree of life!"),
        river("River Scene"),
        forest("Forest Scene"),
        mountain("Mountain Scene"),
        temple("Go to the temple to regain faith"),
        knowledge("The tree of Knowlege!"),
        building("The Great and Spacious Building");
        
        private String locationDescription;
        
        SceneType(String locationDescription){
        this.locationDescription = locationDescription;  
        
        }
        public String getLocationDescription(){
        return locationDescription;
        }
        
    }
    
    static void moveActorsToStartingLocation(Map map) 
            throws MapControlException {
        //for every character
        Character[] characters = Character.values();
        
        for (Character character : characters){
            Point coordinates = character.getCoordinates();
            MapControl.moveCharacterToLocation(character, coordinates);
        }
    }
    
    
    public static void moveCharacterToLocation(Character charscter, Point coordinates)
                            throws MapControlException{
        Map map = TreeOfLife.getCurrentGame().getMap();
        int newRow = coordinates.x;
        int newColumn = coordinates.y;
        
        if (newRow<0 || newRow >= map.getNoOfRows()||
                newColumn<0 || newColumn >= map.getNoOfColumns()){
            throw new MapControlException("Cannot move character to this location"
                                        + coordinates.x + "," + coordinates.y
                                        + "because that location is out of bounds.");  
        }
        
    }
    
  

    
    private static Scene[] createScenes() {
        
        Game game = TreeOfLife.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        //Start Scene
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
        
        //Forest Scene
        Scene ForestScene = new Scene();
        ForestScene.setDescription(
                    "\nYou made it to the forest. Try to gain enough faith to"
                  + "progress to the next scene by following instructions. \n");
        ForestScene.setSymbol(" ^^^ ");
        ForestScene.setBlocked(false);
        scenes[SceneType.forest.ordinal()] = ForestScene;
        
        
        //River Scene
        Scene RiverScene = new Scene();
        RiverScene.setDescription(
                    "\nYou made it to the river. Try to gain enough faith to"
                  + "progress to the next scene by following instructions. \n");
        
        RiverScene.setSymbol(" ~~~ ");
        RiverScene.setBlocked(true);
        scenes[SceneType.river.ordinal()] = RiverScene;
        
        
        //Mountain Scene
        Scene MountainScene = new Scene();
        MountainScene.setDescription(
                    "\nYou made it to the mountain. Try to gain enough faith to"
                  + "progress to the next scene by following instructions. \n");
        MountainScene.setSymbol(" MMM ");
        MountainScene.setBlocked(true);
        scenes[SceneType.mountain.ordinal()] = MountainScene;
        
        //Tree of Life
        Scene finishScene = new Scene();
        finishScene.setDescription(
                    "\nCongratulations! Well done thou good and faithful servant."
                  + "You have had great faith and have reached the Tree of Life.");
        finishScene.setSymbol(" FN ");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
       
       //Temple
        Scene templeScene = new Scene();
        templeScene.setDescription(
                    "\n Pray at the alter to gain faith for you long journey!");
        templeScene.setSymbol(" T^T ");
        templeScene.setBlocked(false);
        scenes[SceneType.temple.ordinal()] = templeScene;
        
        
        //Tree of Knowledge
        Scene knowledgeScene = new Scene();
        knowledgeScene.setDescription(
                    "\n Tree of Knowledge you made it far but not quite far enough.");
        knowledgeScene.setSymbol(" !K! ");
        knowledgeScene.setBlocked(true);
        scenes[SceneType.knowledge.ordinal()] = knowledgeScene;
        
        
        //Spacious Building
        Scene buildingScene = new Scene();
        buildingScene.setDescription(
                    "\n Didn't quite make it this time.");
        buildingScene.setSymbol(" *-* ");
        buildingScene.setBlocked(true);
        scenes[SceneType.building.ordinal()] = buildingScene;
        
        return scenes;
       
    }
    public static void moveCharactersToStartingLocation(Map map) throws MapControlException {

       // System.out.println("*** called moveCharactersToStartingLocation() ****");

        Character character = TreeOfLife.getCurrentGame().getCharacter();
     

        Point coordinates = character.getCoordinates();
        MapControl.moveCharactersToLocation(character, coordinates);
    }
    
       public static void moveCharactersToLocation(Character character, Point coordinates) throws MapControlException {

        Map map = TreeOfLife.getCurrentGame().getMap();

        int newRow = coordinates.x ;
        int newColumn = coordinates.y ;

        if (newRow < 0 || newRow >= map.getNoOfRows()
                || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move to this location "
                    + coordinates.x + ", " + coordinates.y
                    + " it is outside the bounds of the map.");
        }
        

        
        character.getCoordinates().x = coordinates.x;
        character.getCoordinates().y = coordinates.y;
        //set location as visited
        Location location = map.getLocations()[coordinates.x][coordinates.y];
//       throw new MapControlException("starting location is: "+location); //this is to test location 
        location.setVisited(true);
         //if moves to new level then setCurrentLevel
        MapControl setSpot= new MapControl();
        setSpot.setCurrentSpot(location);
     
    
    
    
       }
    
    
    public void setCurrentSpot(Location location){
        Location[][] locations = TreeOfLife.getCurrentGame().getMap().getLocations();
        if (location == locations[0][1]){
            TreeOfLife.getCurrentGame().setCurrentPlace(SceneType.start);
        }
        else if (location == locations[0][0]){
            TreeOfLife.getCurrentGame().setCurrentPlace(SceneType.temple);
        }
        else if (location == locations[1][0]){
            TreeOfLife.getCurrentGame().setCurrentPlace(SceneType.forest);
        }
        else if (location == locations[1][2]){
            TreeOfLife.getCurrentGame().setCurrentPlace(SceneType.river);
        }
        else if (location == locations[1][4]){
            TreeOfLife.getCurrentGame().setCurrentPlace(SceneType.mountain);
        }
        else if (location == locations[2][2]){
            TreeOfLife.getCurrentGame().setCurrentPlace(SceneType.finish);
        }
        else if (location == locations[4][1]){
            TreeOfLife.getCurrentGame().setCurrentPlace(SceneType.knowledge);
        }
        else if (location == locations[4][4]){
            TreeOfLife.getCurrentGame().setCurrentPlace(SceneType.building);
        }
        
     
    }
        
}

