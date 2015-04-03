/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.model.FaithMeter;
import static treeoflife.TreeOfLife.getCurrentGame;


/**
 *
 * @author MonicasApple
 */
public class FaithMeterView extends View{
   public FaithMeterView(){
//       FaithMeter faithMeter = TreeOfLife.getCurrentGame().getFaithMeter();
//       this.console.println("**********************************"
//               + "\nFaithPoints"
//               + "**********************************"
//               + "Your Faith Points are " + faithMeter.getFaithCurrent());
//       this.console.println("\nE - Exit");
               
       super("\n***************************************"
               + "================================================"
               + "\n FAITH POINTS"
               + "\n================================================");
       try{
           FaithMeter faithMeter = getCurrentGame().getFaithMeter();
           
           this.console.println("Your Faith points are " + faithMeter.getFaithCurrent());
           this.console.println("\nE - Exit to Game Menu");
       }catch (Exception ex){
           ErrorView.display(this.getClass().getName(), "Error reading input "+ex.getMessage());
       }
   }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0); //get first character entered
        switch (choice){
            
            case 'E': 
                this.displayGameMenu();            
                break;
            default:
            ErrorView.display("ProgressMeterView", "****Invalid selection **** Try again");
                break;
}
                return true;
    }

    private void displayGameMenu() {
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    }

    void getFaithCurrent() {
        FaithMeter faithMeter = new FaithMeter();
        faithMeter.getFaithCurrent();
    }
   
   
   
   
   
   
   
   
   
   
}
