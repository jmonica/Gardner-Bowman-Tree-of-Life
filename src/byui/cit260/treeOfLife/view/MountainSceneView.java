
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.MountainControl;
import java.util.Scanner;

/**
 *
 * @author MonicasApple
 */
public class MountainSceneView {
    private final String MENU ="\n"
            +"\n--------------------------------------------------"
            +"\n| MOUNTAIN SCENE                                 |"
            +"\n--------------------------------------------------"
            +"\nYou have made it to the mountain.                 "
            +"\nIn order to make it down safely you need to buy a "
            +"\nrope long enough to get down                      "
            +"\nPick up a rock and drop it down the cliff. Count  "
            +"\nthe seconds it takes to hit the bottom.           "
            +"\n--------------------------------------------------";           

    public void display() {
        
        char height = ' ';
        do {
            System.out.println(MENU);
            
            double input = this.getInput();
            
        } while (height != 'E');
        
    }

    private double getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        double height = 0;
        
        while (!valid) {
            System.out.println("How many second did the rock take to hit the ground?");
            
            
            height = Double.parseDouble(keyboard.nextLine().trim());
            
            
            if (height > 1) {
                
                MountainControl mountainControl = new MountainControl();
                mountainControl.calcHeightOfMountain(height);
            } else {
                System.out.println("Invalid selection");
                continue;
                
            } break;
        }
        return height;
            
    }

    
}
