/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.RiverControl;
import java.util.Scanner;

/**
 *
 * @author gradygb
 */
public class RiverSceneView {
    
    private final String MENU ="\n"
            +"\n--------------------------------------------------"
            +"\n| RIVER SCENE                                    |"
            +"\n--------------------------------------------------"
            +"\nNow you are at the river. You need to find a tree "
            +"\nthat is wide enough to walk on to across the river"
            +"\nsafelly. Type radius of a tree.                   "
            +"\n*The radius cannot be smaller than 3 in and bigger"
            +"\nthan 6 in.                                        "
            +"\n--------------------------------------------------";           

    public void display() {
        
        char radius = ' ';
        do {
            System.out.println(MENU);
            
            double input = this.getInput();
            
        } while (radius != 'E');
        
    }

    private double getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        double radius = 0;
        
        while (!valid) {
            System.out.println("Type the radius of the tree.");
            
            
            radius = Double.parseDouble(keyboard.nextLine().trim());
            
            
            if (radius > 1) {
                
                RiverControl riverControl = new RiverControl();
                riverControl.calcCircumference(radius);
            } else {
                System.out.println("Invalid selection");
                continue;
                
            } break;
        }
        return radius;
            
    }

    
}
