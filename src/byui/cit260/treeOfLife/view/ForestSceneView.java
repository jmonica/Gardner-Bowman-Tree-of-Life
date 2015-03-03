/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.ForestControl;
import java.util.Scanner;

/**
 *
 * @author MonicasApple
 */
public class ForestSceneView extends View{
       private final String MENU ="\n"
            +"\n--------------------------------------------------"
            +"\n| FOREST SCENE                                   |"
            +"\n--------------------------------------------------"
            +"\nYou made it to the forest!                        "
            +"\nSee if you can find the right tree to make it     "
            +"\nacross the river safely                           "
            +"\nMeasure the distance from the tree.               "
            +"\nCount how many fist high the tree is              "
            +"\n--------------------------------------------------";           

    public void display() {
        
        char fists = ' ';
        do {
            System.out.println(MENU);
            
            double input = this.getInput();
            
        } while (fists != 'E');
         char distance = ' ';
        do {
            System.out.println(MENU);
            
            double input = this.getInput();
            
        } while (distance != 'E');
    }

    
    private double getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        double distance = 0;
        double fists = 0;
        
        while (!valid) {
            System.out.println("Type the distance from the tree.");
            
            
            distance = Double.parseDouble(keyboard.nextLine().trim());
            
            
            if (distance > 1) {
                
                ForestControl forestControl = new ForestControl();
                forestControl.calcHeightOfTree(distance, fists);
            }
            else {
                System.out.println("Invalid selection");
                continue;
            }
                
            System.out.println("Type the amount of fists high the tree is");
            
            if (fists > 1) {
                
                ForestControl forestControl = new ForestControl();
                forestControl.calcHeightOfTree(distance, fists);
            }
            else {
                System.out.println("Invalid selection");
                continue;
                
            } break;
        }
        return fists;
            
    }
}

