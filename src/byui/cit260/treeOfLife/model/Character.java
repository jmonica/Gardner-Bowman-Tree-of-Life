/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MonicasApple
 */
public enum Character implements Serializable{
    
    Nephi("Faithful son and later the prophet leader of the Nephites."),
    Laman("The oldest rebellious brother of the Lamanites."),
    Sam("The youngest boy and faithful brother of Nephi.");
    
    private final String description;
    private final Point coordinates;

    Character (String description){
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
       return description;
    }

    public Point getCoordinates(){
        return coordinates;
    }

    @Override
    public String toString() {
        return "Character{" + "description=" + description + ", coordinates=" + coordinates + '}';
    }


   
    
    
}
