
package byui.cit260.treeOfLife.view;

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
    
    

    private void doAction(char selection) {
         switch (selection) {
             case 'C':
                 this.characterSelection();
                 break;
             case 'Q':
                 return;
             default:
                 System.out.println("\n*** Invalid selection ***");
                 break;
         }
    }

    private void characterSelection() {
        System.out.println("**** characterSelection function called");
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}