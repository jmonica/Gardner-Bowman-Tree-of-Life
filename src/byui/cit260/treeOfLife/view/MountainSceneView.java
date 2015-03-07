
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.MountainControl;

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
        
           do{
            System.out.println("enter the seconds"); //display main menu
            String valueOne = this.getInput(); //get the user's selection

            double time = Double.parseDouble(valueOne);

            this.doAction(time); //do action based on selection
        
        }while (!value.equals("E")); //an selction is not "Exit"
    }
    
    @Override
    public boolean doAction(Object obj) {
        double time;

        //call the control function to perform the task
        MountainControl mountainControl = new MountainControl();
        //display information to be viewed by the user
        mountainControl.display(double height);
        return true;
        
    }


    

    
}
