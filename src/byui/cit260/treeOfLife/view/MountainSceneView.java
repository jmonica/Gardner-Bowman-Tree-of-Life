
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.MountainControl;
import byui.cit260.treeOfLife.exceptions.MountainControlException;


/**
 *
 * @author MonicasApple
 */
public class MountainSceneView extends View{           

    public MountainSceneView() {
        super("\n"
            +"\n--------------------------------------------------"
            +"\n| MOUNTAIN SCENE                                 |"
            +"\n--------------------------------------------------"
            +"\nYou have made it to the mountain.                 "
            +"\nIn order to make it down safely you need to buy a "
            +"\nrope long enough to get down                      "
            +"\nPick up a rock and drop it down the cliff. Count  "
            +"\nthe seconds it takes to hit the bottom.           "
            +"\n--------------------------------------------------");
    }
    
    @Override
    public void display(){
        String value = null;
        double time = 0.0;
           
        do{
            System.out.println("enter the seconds"); //display main menu
            String valueTime = this.getInput(); //get the user's selection
             try{
                 time = Double.parseDouble(valueTime);
             }catch (NumberFormatException nf){
                 System.out.println("\n You must enter a valid number."
                        + "Try again or enter E to exit");
             }
            

            this.doAction(time); //do action based on selection
        
        }while (!value.equals("E")); //an selction is not "Exit"
    }
    
    @Override
    public boolean doAction(Object obj) {
        double time;

        //call the control function to perform the task
        try {
            MountainControl.calcHeightOfMountain(double time);
        } catch (MountainControlException me){
            System.out.println(me.getMessage());
        }
        MountainControl mountainControl = new MountainControl();
        //display information to be viewed by the user
        double height = 0;
        System.out.println("the height is" + height);
        return true;
        
    }


    

    
}
