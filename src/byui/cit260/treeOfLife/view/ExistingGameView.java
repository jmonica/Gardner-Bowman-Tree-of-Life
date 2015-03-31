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
public class ExistingGameView extends View {

    public ExistingGameView() {
        super("\n");
    }
    

    private void startGameOne() {
        this.console.println("**** startGameOne function called");
    }

    private void startGameTwo() {
        this.console.println("**** startGameTwo function called");
    }

    private void startGameThree() {
        this.console.println("**** startGameThree function called");
    }


    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}
