/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.model;

import java.io.Serializable;
import java.util.Objects;
import treeoflife.TreeOfLife;

/**
 *
 * @author gradygb
 */
public class Scene implements Serializable{
   private char type;
    private String description;
    private char symbol;
    
    private Location[] location;

    private void setMapSymbol(String _st_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBlocked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTravelTime(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTravelTime(double POSITIVE_INFINITY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    private static Scene[] createScenes() throws MapControlException{
        
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
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                    "\nCongratulations! Well done thou good and faithful servant."
                  + "You have had great faith and have reached the Tree of Life.");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
       return null;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        // start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.river.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.temple.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.knowledge.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.building.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.finish.ordinal()]);
    }
    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Scene{" + "type=" + type + ", description=" + description + ", symbol=" + symbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.type;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + this.symbol;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return this.symbol == other.symbol;
    }
    
} 