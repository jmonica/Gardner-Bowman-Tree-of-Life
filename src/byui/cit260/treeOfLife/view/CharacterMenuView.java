/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.model.Character;
import byui.cit260.treeOfLife.model.CharacterInventory;
import java.util.Scanner;

/**
 *
 * @author MonicasApple
 */
public class CharacterMenuView extends View{


    public CharacterMenuView(){
        super("\n"
            +"\n----------------------------------------------------"
            +"\n| Begin Game Menu                                  |"
            +"\n----------------------------------------------------"
            +"\nC - Choose Character                                "
            +"\nE - Exit                                           "
            +"\n----------------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
                
        String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (value) {
            case "C":
                this.characterSelection();
                break;
            case "E":
                return false;
            default:
                System.out.println("\n*** Invalid selection ***");
                break;
        }
        return true;
   

}

        public void characterSelection() {
            
            System.out.println(Character.Nephi.name());
            System.out.println("Choose Character");
            System.out.println("\n"
            +"\n----------------------------------------------------"
            +"\n| Character Choice                                 |"
            +"\n----------------------------------------------------"
            +"\nN- Nephi                                   "
            +"\nL - Laman                                          "
            +"\nS - Sam                                          "         
            +"\n----------------------------------------------------");
            Scanner input = new Scanner(System.in);
            String value = input.next();
            
             value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (value) {
            case "N":
                CharacterInventory.setCharacter(Character.valueOf("Nephi"));
                break;
            case "L":
                CharacterInventory.setCharacter(Character.valueOf("Laman"));
                break;
            case "S":
                CharacterInventory.setCharacter(Character.valueOf("Sam"));
                break;
            default:
                System.out.println("\n*** Invalid selection ***");
                break;
        }
        //return true;
        }
}


        

