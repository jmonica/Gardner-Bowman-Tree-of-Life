/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.control.GameControl;
import treeoflife.TreeOfLife;

/**
 *
 * @author MonicasApple
 */
public class CharacterMenuView {

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public class GameMenuView extends View{

    public GameMenuView() {
        super("\n"
            +"\n----------------------------------------------------"
            +"\n| Begin Game Menu                                  |"
            +"\n----------------------------------------------------"
            +"\nC - Choose Character                                "
            +"\nQ - Quit                                            "
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
            //display the game menu
            CharacterMenuView characterMenu = new CharacterMenuView();
            characterMenu.displayMenu();
        }
}
}

        

