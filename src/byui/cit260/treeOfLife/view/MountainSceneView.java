
package byui.cit260.treeOfLife.view;

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
