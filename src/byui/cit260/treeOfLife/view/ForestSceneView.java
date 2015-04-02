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
        try {
            String value = keyboard.readLine();
            
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
            return true;
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                        "Error reading input:"+ex.getMessage());
        }
        return false;
    }
            


//    @Override
//    public void display(){
    public boolean measurementGetter(){
        String value = null;
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
            double[] inputs = new double[2];
            inputs[0] = fists;
            inputs[1] = distance;
            this.calHeight(this); //do action based on selection
        
        }while (!value.equals("E")); //and selction is not "Exit"
        return false;
    
    }
     //@Override
    private boolean calHeight(Object obj) {
        double[] inputValues = (double[]) obj;
        double fists = inputValues[0];
        double distance = inputValues[1];
        
        //call the control function to perform the task
        ForestControl forestControl = new ForestControl();
        forestControl.calcHeightOfTree(distance, fists);
        
        //display information to be viewed by the user
        double theHeight = 0;
        this.console.println("The height of the tree is" + theHeight);
        return true;
    }
    
   
    
   
    
}

