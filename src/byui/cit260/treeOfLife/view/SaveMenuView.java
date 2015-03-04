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
class SaveMenuView extends View{
    

    public SaveMenuView() {
        super("\n"
            +"\n----------------------------------------------------"
            +"\n| Save Game Menu                                   |"
            +"\n----------------------------------------------------"
            +"\nA - Save Game                                       "
            +"\nE - Exit                                            "
            +"\n----------------------------------------------------");
    }

    private void saveGame() {
                System.out.println("**** saveGame function called");
    }

    @Override
    public boolean doAction(Object obj) {
                
        String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (value){
            case 'A':
                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection ***");
                break;
        }
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
