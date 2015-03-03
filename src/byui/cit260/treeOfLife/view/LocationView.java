/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import java.util.Scanner;

/**
 *
 * @author gradygb
 */
public class LocationView extends View{
  
    private final String MENU = "\n"
                + "\n*********************************************************"
                + "\n* Location Menu                                         *"
                + "\n*********************************************************"
                + "\nA - Forest                                               "
                + "\nB - River                                                "
                + "\nC - Mountain                                             "
                + "\nE - Exit                                                 "
                + "\n*********************************************************";
    
    public void displayMenu() {
        
        char selection = ' ';
        do{
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'E');
    }

    private String getInput() {
        boolean valid = false;
        String getInput = null;
        Scanner keyboard = new Scanner (System.in);
        
        while (!valid) {
            System.out.println("Choose a scene to visit.");
            
            getInput = keyboard.nextLine();
            getInput = getInput.trim();
            
            if (getInput.length() != 1) {
                System.out.println("Invalid selection");
                continue;
            } 
            break;
        }
        return getInput;
    }

    public void doAction(char selection) {
        
        switch (selection){
            case 'A':
                this.forestScene();
                break;
            case 'B':
                this.riverScene();
                break;
            case 'C':
                this.mountainScene();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection***");
                break;
        }

    }

    private void forestScene() {
        ForestSceneView forestScene = new ForestSceneView();
        forestScene.display();
    }

    private void riverScene() {
        RiverSceneView riverScene = new RiverSceneView();
        riverScene.display();
    }

    private void mountainScene() {
        MountainSceneView mountainScene = new MountainSceneView();
        mountainScene.display();
}
}
