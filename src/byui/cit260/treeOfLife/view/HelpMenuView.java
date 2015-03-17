/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

/**
 *
 * @author gradygb
 */
public class HelpMenuView extends View {


    public HelpMenuView() {
        super("\n"
            +"\n----------------------------------------------------"
            +"\n| Help Menu                                        |"
            +"\n----------------------------------------------------"
            +"\nG - What is the goal of the game?"
            +"\nM - How to move?"
            +"\nE - Exit"
            +"\n----------------------------------------------------");
    }

    private void gameInstruction() {
        System.out.println("\n\n**************************************************");
                          
        System.out.println("*                                                *"
                       + "\n* Embark on a journey to reach the Tree of Life. *"
                       + "\n* It will require faith and the ability to stay  *"
                       + "\n* the course despite the hardships you encounter.*"
                       + "\n* You will need to aquire the Armor of God and   *"
                       + "\n* Shield of Faithe along the way to overcome the *"
                       + "\n* challenges ahead.                              *");
        
        System.out.println("*                                                *"
                       + "\n* Make sure you take the time to restore your    *"
                       + "\n* faith by visiting the temple often. Here you   *"
                       + "\n* will be strengthened in your faith. If you take*"
                       + "\n* a wrong turn or explore an area that takes you *"
                       + "\n* from your course, you have the chance to reset *"
                       + "\n* by praying at the mantle where you can repent  *"
                       + "\n* from your poor decisions. Be careful, if you   *"
                       + "\n* spend more time at the praying mantle, other   *"
                       + "\n* future opportunities may not present themselves*"
                       + "\n* later in your journey.                         *");
        
        System.out.println("*                                                *"
                        + "\n* The goal is to reach the tree of life, but     *"
                        + "\n* depending on your faith, you may find yourself *"
                        + "\n* stuck in the large and spacious building or at *"
                        + "\n* the Tree of Knowledge. The Tree of Knowledge   *"
                        + "\n* only grants you one gift and if you fail to    *"
                        + "\n* reach either tree, you will surley have been   *"
                        + "\n* lost in the spacious building.                 *"
                        + "\n*                                                *");
        System.out.println("**************************************************");

    }

    private void howToMove() {
        System.out.println("\n\n**************************************************");
                          
        System.out.println("*                                                *"
                       + "\n* Type in the letter for the corresponding       *"
                       + "\n* selection. This will help you to move from one *"
                       + "\n* menu to the next.                              *"
                       + "\n* Make sure to use capital letters throughout    *"
                       + "\n* the game. If you don't the move will not be    *"
                       + "\n* recognized.                                    *"
                       + "\n*                                                *");
        System.out.println("**************************************************");
    }

    @Override
    public boolean doAction(Object obj) {
                
        String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (value) {
            case "G":
                this.gameInstruction();
                break;
            case "M":
                this.howToMove();
                break;
            case "E":
                return false;
            default:
                System.out.println("\n*** Invalid selection ***");
                break;
        }
        
    return true;
    }
    
}
