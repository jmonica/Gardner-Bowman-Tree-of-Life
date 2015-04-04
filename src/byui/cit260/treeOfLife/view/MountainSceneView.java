
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.MountainControl;
import byui.cit260.treeOfLife.exceptions.MountainControlException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
            +"\nthe seconds it takes to hit the bottom.  "
            +"\nM- Enter in measurements"
            +"\nE- Exit        "
            +"\n--------------------------------------------------");
    }
    @Override
    public boolean doAction(Object obj){
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch(choice){
            case 'M':
        {
            try {
                this.measurementGetter();
            } catch (MountainControlException ex) {
                Logger.getLogger(MountainSceneView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 'E':
                this.location();
            default:
                this.console.println("\n*** Invalid selection ***");
                break;
        }
        return false;
    }
    
    //@Override
    public void measurementGetter() throws MountainControlException{
        boolean done = false;
        double time = 0.0;
           
        do{
            this.console.println("enter the seconds"); //display main menu
            String valueTime = this.getInput(); //get the user's selection
             try{
                 time = Double.parseDouble(valueTime);
             }catch (NumberFormatException nf){
                 ErrorView.display(this.getClass().getName(), "Error reading input: " + nf.getMessage());
             }
            if  (time < 1 || time > 10){
            System.out.println(time + " seconds is too long."
                              + "The rope you will need is too long."
                              + "find a different cliff.");
        }
            double[] input = new double [1];
            input[0] = time;
            this.calMountain(input); //do action based on selection
            done = true;
        }while (! done); //an selction is not "Exit"
    }
    
    //@Override
    public boolean calMountain(double [] input) throws MountainControlException {
        double time = input[0];

        //call the control function to perform the task
        MountainControl mountainControl = new MountainControl();
        mountainControl.calcHeightOfMountain(time);
        
        //display information to be viewed by the user
        double height = 0;
        this.console.println("the height is" + height);
        return true;
        
    }

 private void location() {
        LocationView locationView = new LocationView();
        locationView.display();
    }
    

    
}
