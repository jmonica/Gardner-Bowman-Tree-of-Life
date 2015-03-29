/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import java.io.PrintWriter;
import treeoflife.TreeOfLife;

/**
 *
 * @author gradygb
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = TreeOfLife.getOutFile();
    private static PrintWriter logFile = TreeOfLife.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
                    "--------------------------------------"
                    +"\n- ERROR -" + errorMessage
                    +"\n-----------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }

    
}
