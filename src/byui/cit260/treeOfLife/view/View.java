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
public abstract class View implements ViewInterface{
    
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value;
        
        do{
        System.out.println(this.promptMessage); //display main menu
        value = this.getInput(); //get the user's selection        
        this.doAction(value); //do action based on selection
        
        }while (!value.equals("E")); //an selction is not "Exit"
    }
    
    @Override
     public String getInput() {
        boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
        
        //prompt for the selection
        System.out.println("Enter your selection");
        
        //get the selection from the keyboard and trim off the blanks
        selection = keyboard.nextLine();
        selection = selection.trim();
        
        //if the selection is invaled 
        if (selection.length() < 1){
            System.out.println("Invalid selection");
            continue;
        }
        break;
        }
        return selection;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    private void doAction(String value) {
        this.doAction(Object obj);
    }

}
