/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author MonicasApple
 */
public class Location implements Serializable{
    private int row;
    private int column;
    private boolean visited;   
    private Scene scene;
    private SceneTwo sceneTwo;
    private ArrayList<Character> characters;

    public Location() {
    }
    
    

    public double getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public SceneTwo getSceneTwo() {
        return sceneTwo;
    }

    public void setSceneTwo(SceneTwo sceneTwo) {
        this.sceneTwo = sceneTwo;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.column;
        hash = 53 * hash + (this.visited ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.scene);
        hash = 53 * hash + Objects.hashCode(this.sceneTwo);
        hash = 53 * hash + Objects.hashCode(this.characters);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.sceneTwo, other.sceneTwo)) {
            return false;
        }
        if (!Objects.equals(this.characters, other.characters)) {
            return false;
        }
        return true;
    }

    

    
    
    
}
