/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.model.Character;
import java.io.IOException;
import treeoflife.TreeOfLife;

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

        switch (choice) {
            case 'C':
        {
            try {
                this.characterSelection();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
            }
        }
                break;
            case 'E':
                return false;
            default:
                System.out.println("\n*** Invalid selection ***");
                break;
        }
        return true;
   

}

        public void characterSelection() throws IOException {
            
            //this.console.println(Character.Nephi.name());
            this.console.println("Choose Character");
            this.console.println("\n"
            +"\n----------------------------------------------------"
            +"\n| Character Choice                                 |"
            +"\n----------------------------------------------------"
            +"\nN - Nephi"
            +"\nL - Laman"
            +"\nS - Sam"         
            +"\n----------------------------------------------------");
            
            
           
            
            String value = keyboard.readLine();
            
            value = value.toUpperCase();//convert to all upper case
            char choice = value.charAt(0); //get the first character entered
            
            
            switch (choice) {
            case 'N':
                this.getNephi();
//                TreeOfLife.getCurrentGame().setCharacter(Character.Nephi);
//                this.console.println("Welcome Nephi! " + Character.Nephi.getDescription());
//                this.console.println("Your Faith total are " + Character.Nephi.getFaithPoints());
//                //Faith
//                int faith = TreeOfLife.getCurrentGame().getCharacter().getFaithPoints();
//                TreeOfLife.getCurrentGame().setFaith(faith);
//                
//                gameMenu.display();
                break;
            case 'L':
                this.getLaman();
//                TreeOfLife.getCurrentGame().setCharacter(Character.Laman);
//                this.console.println("Welcome Laman! " + Character.Laman.getDescription());
//                this.console.println("Your Faith total are " + Character.Laman.getFaithPoints());
//                //Faith
//                int faith = TreeOfLife.getCurrentGame().getCharacter().getFaithPoints();
//                TreeOfLife.getCurrentGame().setFaith(faith);
//                
//                gameMenu.display();
                
                
                break;
            case 'S':
                this.getSam();
//                TreeOfLife.getCurrentGame().setCharacter(Character.Sam);
//                this.console.println("Welcome Sam! " + Character.Sam.getDescription());
//                this.console.println("Your Faith total are " + Character.Sam.getFaithPoints());
//                //Faith
//                int faith = TreeOfLife.getCurrentGame().getCharacter().getFaithPoints();
//                TreeOfLife.getCurrentGame().setFaith(faith);
//                
//                gameMenu.display();
                
                break;
            default:
                this.console.println("\n*** Invalid selection ***");
                break;
        }
        //return true;
            
        }

    private void getNephi() {
                TreeOfLife.getCurrentGame().setCharacter(Character.Nephi);
                this.console.println("Welcome Nephi! " + Character.Nephi.getDescription());
                this.console.println("Your Faith total is " + Character.Nephi.getFaithPoints());
                
                //Faith
                int faith = TreeOfLife.getCurrentGame().getCharacter().getFaithPoints();
                TreeOfLife.getCurrentGame().setFaith(faith);
                
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
    }

    private void getLaman() {
         TreeOfLife.getCurrentGame().setCharacter(Character.Laman);
                this.console.println("Welcome Laman! " + Character.Laman.getDescription());
                this.console.println("Your Faith total is " + Character.Laman.getFaithPoints());
                //Faith
                int faith = TreeOfLife.getCurrentGame().getCharacter().getFaithPoints();
                TreeOfLife.getCurrentGame().setFaith(faith);
                
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
    }

    private void getSam() {
        TreeOfLife.getCurrentGame().setCharacter(Character.Sam);
                this.console.println("Welcome Sam! " + Character.Sam.getDescription());
                this.console.println("Your Faith total is " + Character.Sam.getFaithPoints());
                //Faith
                int faith = TreeOfLife.getCurrentGame().getCharacter().getFaithPoints();
                TreeOfLife.getCurrentGame().setFaith(faith);
                
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
    }
        
        
}


        

