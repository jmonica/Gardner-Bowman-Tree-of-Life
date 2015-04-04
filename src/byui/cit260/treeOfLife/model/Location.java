/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.model;

import java.io.Serializable;
import java.util.Arrays;
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
    private Character[] characters;
    private boolean blocked;
    private int xCoordinate;
    private int yCoordinate;
    

    public Location() {
    }
    
    public boolean isBlocked() {
        return blocked;
    }
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
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

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", scene=" + scene + ", sceneTwo=" + sceneTwo + ", characters=" + characters + ", blocked=" + blocked + ", xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.column;
        hash = 97 * hash + (this.visited ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.scene);
        hash = 97 * hash + Objects.hashCode(this.sceneTwo);
        hash = 97 * hash + Arrays.deepHashCode(this.characters);
        hash = 97 * hash + (this.blocked ? 1 : 0);
        hash = 97 * hash + this.xCoordinate;
        hash = 97 * hash + this.yCoordinate;
        return hash;
    }


    

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 53 * hash + this.row;
//        hash = 53 * hash + this.column;
//        hash = 53 * hash + (this.visited ? 1 : 0);
//        hash = 53 * hash + Objects.hashCode(this.scene);
//        hash = 53 * hash + Objects.hashCode(this.sceneTwo);
//        hash = 53 * hash + Objects.hashCode(this.characters);
//        return hash;
//    }
//
    
    @Override
    public boolean equals(Object obj){
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
        if (!Arrays.deepEquals(this.characters, other.characters)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (this.xCoordinate != other.xCoordinate) {
            return false;
        }
        if (this.yCoordinate != other.yCoordinate) {
            return false;
        }
        return true;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Location other = (Location) obj;
//        if (this.row != other.row) {
//            return false;
//        }
//        if (this.column != other.column) {
//            return false;
//        }
//        if (this.visited != other.visited) {
//            return false;
//        }
//        if (!Objects.equals(this.scene, other.scene)) {
//            return false;
//        }
//        if (!Objects.equals(this.sceneTwo, other.sceneTwo)) {
//            return false;
//        }
//        if (!Objects.equals(this.characters, other.characters)) {
//            return false;
//        }
//        return true;
//    }


    

    
    
    
}
