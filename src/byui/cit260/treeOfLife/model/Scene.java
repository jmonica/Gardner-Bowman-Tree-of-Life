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
    private char blocked;

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

    public char getBlocked() {
        return blocked;
    }

    public void setBlocked(char blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "Scene{" + "type=" + type + ", description=" + description + ", symbol=" + symbol + ", blocked=" + blocked + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.type;
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + this.symbol;
        hash = 41 * hash + this.blocked;
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
        if (this.symbol != other.symbol) {
            return false;
        }
        return this.blocked == other.blocked;
    }

}
