/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.model;

/**
 *
 * @author MonicasApple
 */
public class Location {
    private double row;
    private double column;
    private double visited;   
    private Scene scene;
    private SceneTwo sceneTwo;
    

    public Location() {
    }
    
    

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public double getVisited() {
        return visited;
    }

    public void setVisited(double visited) {
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
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.visited) ^ (Double.doubleToLongBits(this.visited) >>> 32));
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
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (Double.doubleToLongBits(this.visited) != Double.doubleToLongBits(other.visited)) {
            return false;
        }
        return true;
    }
    
    
    
}
