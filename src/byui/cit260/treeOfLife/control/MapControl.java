/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.control;

import byui.cit260.treeOfLife.model.Map;

/**
 *
 * @author MonicasApple
 */
public class MapControl {

    private static Map createMap() {
       // create the map
        Map map = new Map(20, 20);
        
        //creat the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    static void moveActorsToStartingLocation(Map map) {
        System.out.println("*** called moveActorsToStartingLocation() ***");
    }
    
}
