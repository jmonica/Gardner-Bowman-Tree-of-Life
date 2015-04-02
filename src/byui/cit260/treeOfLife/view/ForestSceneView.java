/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.ForestControl;
import java.io.IOException;

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
            +"\nCount how many fist high the tree is"
            +"\nM - Enter in measurments             "
            +"\nE - Exit "    
            +"\n--------------------------------------------------");
    
    }
    @Override
    public boolean doAction(Object obj){
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch(choice){
            case 'M':
                this.measurementGetter();
                break;
            case 'E':
                return true;
            default:
                this.console.println("\n*** Invalid selection ***");
                break;
        }
        return false;
    }
            


//    @Override
//    public void display(){
    public boolean measurementGetter(){
        boolean done = false;
        double fists = 0.0;
        double distance = 0.0;
        
           do{
            this.console.println("Enter the amount of fists");
            String valueOne = this.getInput(); //get the user's selection
            System.out.println("Enter the distance from the tree"); 
            String valueTwo = this.getInput(); //get the user's selection
            
            try{
            fists = Double.parseDouble(valueOne);
            distance = Double.parseDouble(valueTwo);
            } catch (NumberFormatException nf){
                ErrorView.display(this.getClass().getName(),
                        "Error reading input:"+nf.getMessage());
            }
            //check to see fists is invalid  less than 1 or greater than 5 = error
                //error message 
                    //continue to next iteration
            //check to see distance is invalid  less than  50 or greater than 100
                //error message
                    //continue to next iteration
            if (distance<50|| 100<distance){
            System.out.println("Enter a distance that is bigger than 50 and less than 100");
                }
            if (fists<1 || 5<fists){  
            System.out.println("Enter amount of fists that is bigger than 1 and less than 5");
    }
            double[] inputs = new double[2];
            inputs[0] = fists;
            inputs[1] = distance;
            this.calHeight(inputs); //do action based on selection
            done = true;
        }while (! done); //and selction is not "Exit"
        return false;
    
    }
     //@Override
    private boolean calHeight(double [] inputs) {
       
        double fists = inputs[0];
        double distance = inputs[1];
        
        //call the control function to perform the task
        ForestControl forestControl = new ForestControl();
        forestControl.calcHeightOfTree(distance, fists);
        
        //display information to be viewed by the user
        double theHeight = 0;
        this.console.println("The height of the tree is" + theHeight);
        
        return false;
        
    }
    
   
    
   
    
}

