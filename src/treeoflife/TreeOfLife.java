/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeoflife;

import byui.cit260.treeOfLife.model.Game;

/**
 *
 * @author MonicasApple
 */
public class TreeOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        
        gameOne.setTotalTime(7.00);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
    }
    
}
