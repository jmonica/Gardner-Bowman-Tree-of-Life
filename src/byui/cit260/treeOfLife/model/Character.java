/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.model;

import java.awt.Point;
import java.util.Objects;
import java.io.Serializable;
import treeoflife.TreeOfLife;

/**
 *
 * @author MonicasApple
 */
public enum Character implements Serializable{
    
    Nephi("Faithful son and later the prophet leader of the Nephites.", 15),
    Laman("The oldest son of Lehi, rebellious brother of the Lamanites.", 5),
    Sam("The youngest boy of Lehi, faithful brother of Nephi.", 10);
    
    private final String description;
    private final Point coordinates;
    
    private final int faithPoints;

    Character (String description, int faithPoints){
        this.description = description;
        this.faithPoints = faithPoints;
        
        coordinates = new Point(1,1);
    }
    public int getFaithPoints(){
        return faithPoints;
    }
    
    public String getDescription() {
       return description;
    }

    public Point getCoordinates(){
        return coordinates;
    }

    @Override
    public String toString() {
        return "Character{" + "description=" + description + ", coordinates=" + coordinates + ", faithPoints=" + faithPoints + '}';
    } 
    
    
    public void displayBonus(){
        int[] characterBonus = new int [3];
        
        for (int i=0; i<characterBonus.length; i++){
            System.out.println("Your bonus faith is" + characterBonus);
        }
    }
}
