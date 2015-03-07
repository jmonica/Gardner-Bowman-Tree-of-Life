/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

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
        String value;
        
           do{
            System.out.println("enter the width"); //display main menu
            String valueOne = this.getInput(); //get the user's selection
            System.out.println("enter the height"); //display main menu
            String valueTwo = this.getInput(); //get the user's selection 
            double width = Double.parseDouble(valueOne);
            double height = Double.parseDouble(valueTwo);
            double[] inputs = new double[2];
            inputs[0] = width;
            inputs[1] = height;
            this.doAction(inputs); //do action based on selection
        
        }while (!value.equals("E")); //an selction is not "Exit"
    }
    
    @Override
    public boolean doAction(Object obj) {
        double[] inputValues = (double[]) obj;
        double width = inputValues[0];
        double height = inputValues[1];
        //call the control function to perform the task
        //display information to be viewed by the user
    }
    
}

