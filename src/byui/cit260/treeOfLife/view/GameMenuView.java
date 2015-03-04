
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


    private void characterSelection() {
        System.out.println("**** characterSelection function called");
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(Object obj) {
                
        String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (value) {
             case 'C':
                 this.characterSelection();
                 break;
             case 'Q':
                 return;
             default:
                 System.out.println("\n*** Invalid selection ***");
                 break;
         } 
        return false;
    }
            
}