/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author gradygb
 */
public class Scene implements Serializable{
   private char type;
    private String description;
    private char symbol;
    
    private Location[] location;

    public Scene() {
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