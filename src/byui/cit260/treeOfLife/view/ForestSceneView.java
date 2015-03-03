/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

/**
 *
 * @author MonicasApple
 */
public class ForestSceneView extends View{          

    public ForestSceneView() {
        super("\n"
            +"\n--------------------------------------------------"
            +"\n| FOREST SCENE                                   |"
            +"\n--------------------------------------------------"
            +"\nYou made it to the forest!                        "
            +"\nSee if you can find the right tree to make it     "
            +"\nacross the river safely                           "
            +"\nMeasure the distance from the tree.               "
            +"\nCount how many fist high the tree is              "
            +"\n--------------------------------------------------");
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

