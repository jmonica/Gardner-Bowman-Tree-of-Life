/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.model;

import java.io.Serializable;


/**
 *
 * @author MonicasApple
 */
public class FaithMeter implements Serializable{
   private String description;
   private int faithPointsCurrent;
   

   public FaithMeter(){
       this.description = "\n This is the current amount of faith points you have.";
       this.faithPointsCurrent = 0;
   }
   public int getFaithCurrent(){
       return faithPointsCurrent;
   }
   public void setFaithCurrent(int faithCurrent){
       this.faithPointsCurrent = faithPointsCurrent;
   }
}
