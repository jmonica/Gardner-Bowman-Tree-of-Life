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
public class TempleView extends View{

    public TempleView() {
        super("\n'"
                + "\n--------------------------------------------"
                + "\n| Temple Menu                              |"
                + "\n--------------------------------------------"
                + "\nP - Pray to restore your faith"
                + "\nE - Exit"
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
       String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (choice) {
            case 'P':
                this.pray();
                break;
            case 'E':
                return true;
            default:
                System.out.println("\n*** Invalid selection ***");
                break;
        }
        return false;
    }

    private void pray() {
        this.console.println("\n\n*********************************");
        
        this.console.println("*                                   *"
                        + "\n* Kneal down in front of the alter   *"
                        + "\n* to pray and restore the faith that *"
                        + "\n* you used during the journey.       *"
                        + "\n*                                    *");
        this.console.println("**************************************"
                        + "\n*                                  *"
                        + "\n* Press 'E' to exit the temple     *");
        this.console.println("*************************************");
    }
    
}
