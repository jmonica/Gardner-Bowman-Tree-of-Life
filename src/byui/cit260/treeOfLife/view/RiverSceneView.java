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
            +"\nsafely. Type radius of a tree.                   "
            +"\n*The radius cannot be smaller than 3 in and bigger"
            +"\nthan 6 in."
            +"\n--------------------------------------------------"
            +"\nM - Enter in measurements"
            +"\nE - Exit"
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
                this.location();
            default:
                this.console.println("\n*** Invalid selection ***");
                break;
        }
        return true;
    }
     
private boolean measurementGetter() {
        boolean done = false;
        double radius = 0.0;
        
            do{
                this.console.println("Enter the radius of the Tree");
                String valueRadius = this.getInput(); //get the user's selection 
            
            try{
                radius = Double.parseDouble(valueRadius);
                } catch (NumberFormatException nf){
                    ErrorView.display(this.getClass().getName(),
                        "Error reading input:"+nf.getMessage());
                }
            if (radius < 3 || 6 < radius){
                System.out.println("Enter a radius that is bigger than 3 "
                                  + "\nand less than 6.");
            }
            double[] input = new double[1];
            input[0] = radius;
            this.calRadius(input); //do action based on selection
            done = true;    
        }while (! done);
         return false;   
    }

 private void calRadius(double[] input) {
     double radius = input[0];
     
     RiverControl riverControl = new RiverControl();
     riverControl.calcCircumference(radius);

        
    }
private void location() {
        LocationView locationView = new LocationView();
       locationView.display();     
    }
    }


//        @Override
//    public void display(){
//        String value = null;
//        double radius = 0.0;
//        
//           do{
//            this.console.println("\n-----------------------------------------"
//                                + "\n*You are at the river which you need to  *"
//                                + "\n*go across to get to the mountain.       *"
//                                + "\n*Please enter the radius of a tree to    *"
//                                + "\n*calculate the circumference of the      *"
//                                + "\n*tree to see if it is wide enough        *"
//                                + "\n*to walk on.                             *"
//                                + "\n*The radius should be wider than 3 inches*"
//                                + "\n*and smaller than 6 inches               *"
//                                + "\n------------------------------------------"
//                                + "\n*Enter 'E' to exit the River scene.      *"
//                                + "\n------------------------------------------"); 
//            
//            //display main menu
//            String valueRadius = this.getInput(); //get the user's selection 
//            try{
//            radius = Double.parseDouble(valueRadius);
//            } catch (NumberFormatException nf){
//                this.console.println("\nYou must enter a valid number."
//                        + "Try again or enter E to exit");
//            }
//            this.doAction(radius); //do action based on selection
//        
//        }while (!value.equals("E")); //an selction is not "Exit"
//    }
    
//    @Override
//    public boolean doAction(Object obj) {
//        double radius = 0;
//        //call the control function to perform the task
//        try {
//            RiverControl.calcCircumference(radius);
//        } catch (RiverControlException me){
//            this.console.println(me.getMessage());
//        }
//        return true;
        /*display information to be viewed by the user
        double circumference = 0;
        System.out.println("the circumference is" + circumference);
        return true;*/
    }

   
    
    
}
