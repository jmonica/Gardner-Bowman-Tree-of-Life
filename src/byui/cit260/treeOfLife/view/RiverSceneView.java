/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.RiverControl;
import byui.cit260.treeOfLife.exceptions.RiverControlException;

/**
 *
 * @author gradygb
 */
public class RiverSceneView extends View{
 
    public RiverSceneView() {
        super("\n"
            +"\n--------------------------------------------------"
            +"\n| RIVER SCENE                                    |"
            +"\n--------------------------------------------------"
            +"\nNow you are at the river. You need to find a tree "
            +"\nthat is wide enough to walk on to across the river"
            +"\nsafelly. Type radius of a tree.                   "
            +"\n*The radius cannot be smaller than 3 in and bigger"
            +"\nthan 6 in.                                        "
            +"\n--------------------------------------------------");
    }

        @Override
    public void display(){
        String value = null;
        double radius = 0.0;
        
           do{
            System.out.println("enter the width"); //display main menu
            String valueRadius = this.getInput(); //get the user's selection 
            try{
            radius = Double.parseDouble(valueRadius);
            } catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number."
                        + "Try again or enter E to exit");
            }
            this.doAction(radius); //do action based on selection
        
        }while (!value.equals("E")); //an selction is not "Exit"
    }
    
    @Override
    public boolean doAction(Object obj) {
        double radius = 0;
        //call the control function to perform the task
        try {
            RiverControl.calcCircumference(radius);
        } catch (RiverControlException me){
            System.out.println(me.getMessage());
        }
        /*display information to be viewed by the user
        double circumference = 0;
        System.out.println("the circumference is" + circumference);
        return true;*/
        return false;
    }
}
