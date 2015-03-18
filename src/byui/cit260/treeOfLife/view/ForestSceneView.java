/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.ForestControl;

/**
 *
 * @author MonicasApple
 */
public class ForestSceneView extends View{          

    public ForestSceneView() {
        super("\n"
            +"\n--------------------------------------------------"
            +"\n| FOREST SCENE                                   |"
            +"\n--------------------------------------------------"
            +"\nYou made it to the forest!                        "
            +"\nSee if you can find the right tree to make it     "
            +"\nacross the river safely                           "
            +"\nMeasure the distance from the tree.               "
            +"\nCount how many fist high the tree is              "
            +"\n--------------------------------------------------");
    }

    @Override
    public void display(){
        String value = null;
        
           do{
            System.out.println("enter the amount of fists"); //display main menu
            String valueOne = this.getInput(); //get the user's selection
            System.out.println("enter the distance from the tree"); //display main menu
            String valueTwo = this.getInput(); //get the user's selection
            
            try{
            double fists = Double.parseDouble(valueOne);
            double distance = Double.parseDouble(valueTwo);
            } catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number."
                        + "Try again or enter E to exit.");
            }
            double[] inputs = new double[2];
            inputs[0] = fists;
            inputs[1] = distance;
            this.doAction(inputs); //do action based on selection
        
        }while (!value.equals("E")); //and selction is not "Exit"
    }
    
    @Override
    public boolean doAction(Object obj) {
        double[] inputValues = (double[]) obj;
        double fists = inputValues[0];
        double distance = inputValues[1];
        
        //call the control function to perform the task
        ForestControl forestControl = new ForestControl();
        //display information to be viewed by the user
        double theHeight = 0;
        System.out.println("The height of the tree is" + theHeight);
        return true;
    }
    
}

