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
        System.out.println("**** startGameOne function called");
    }

    private void startGameTwo() {
        System.out.println("**** startGameTwo function called");
    }

    private void startGameThree() {
        System.out.println("**** startGameThree function called");
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}
