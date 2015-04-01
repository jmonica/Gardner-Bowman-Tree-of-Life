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
public class PersonalInventory implements Serializable{
    private String inventoryType;
    private int quantityInStock;
    private int monyAmount;

    public PersonalInventory() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getMonyAmount() {
        return monyAmount;
    }

    public void setMonyAmount(int monyAmount) {
        this.monyAmount = monyAmount;
    }

    @Override
    public String toString() {
        return "PersonalInventory{" + "inventoryType=" + inventoryType 
                + ", quantityInStock=" + quantityInStock + ", monyAmount=" + monyAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.inventoryType);
        hash = 79 * hash + this.quantityInStock;
        hash = 79 * hash + this.monyAmount;
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
        final PersonalInventory other = (PersonalInventory) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        return this.monyAmount == other.monyAmount;
    }
    
}
