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
 * @author MonicasApple
 */
public enum Character implements Serializable{
    
    Nephi("Faithful son and later the prophet leader of the Nephites."),
    Laman("The oldest rebellious brother of the Lamanites."),
    Sam("The youngest boy and faithful brother of Nephi.");
    
    private final String description;
    private final Point coordinates;
 
    private Game game;
    private CharacterInventory characterInventory;

    Character (String description){
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
       return description;
    }

    public point getCoordinates(){
        return coordinates;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public CharacterInventory getCharacterInventory() {
        return characterInventory;
    }

    public void setCharacterInventory(CharacterInventory characterInventory) {
        this.characterInventory = characterInventory;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.name);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
