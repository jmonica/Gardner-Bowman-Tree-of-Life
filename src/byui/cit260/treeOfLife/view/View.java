/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import treeoflife.TreeOfLife;

/**
 *
 * @author gradygb
 */
public abstract class View implements ViewInterface{
    
    String promptMessage;
    
    protected final BufferedReader keyboard = TreeOfLife.getInFile();
    protected final PrintWriter console = TreeOfLife.getOutFile();
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        String value;
        
        do{
        this.console.println(this.promptMessage); //display main menu
        value = this.getInput(); //get the user's selection        
        this.doAction(value); //do action based on selection
        
        }while (!value.equals("E")); //an selction is not "Exit"
    }
    
    @Override
     public String getInput() {
        boolean valid = false;
        String selection = null;
        //team assignment11 - p.14
        while(!valid){ 
        
            try {
                //prompt for the selection
                System.out.println("Enter your selection");
                
                //get the selection from the keyboard and trim off the blanks
                selection = this.keyboard.readLine();
                selection = selection.trim();
                
                //if the selection is invaled
                if (selection.length() < 1){
                    ErrorView.display(this.getClass().getName(),
                            "Invalid selection");
                    continue;
                }
                break;
            } catch (IOException e) {
                //Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                ErrorView.display(this.getClass().getName(),
                        "Error reading input:" + e.getMessage());
                return null;
            }
        }
        return selection;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

}
