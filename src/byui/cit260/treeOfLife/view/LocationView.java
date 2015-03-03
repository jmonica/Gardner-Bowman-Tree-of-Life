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
public class LocationView extends View{

    public LocationView() {
        super("\n"
                + "\n*********************************************************"
                + "\n* Location Menu                                         *"
                + "\n*********************************************************"
                + "\nA - Forest                                               "
                + "\nB - River                                                "
                + "\nC - Mountain                                             "
                + "\nE - Exit                                                 "
                + "\n*********************************************************");
    }   
    
    public void doAction(char selection) {
        
        switch (selection){
            case 'A':
                this.forestScene();
                break;
            case 'B':
                this.riverScene();
                break;
            case 'C':
                this.mountainScene();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection***");
                break;
        }

    }

    private void forestScene() {
        ForestSceneView forestScene = new ForestSceneView();
        forestScene.display();
    }

    private void riverScene() {
        RiverSceneView riverScene = new RiverSceneView();
        riverScene.display();
    }

    private void mountainScene() {
        MountainSceneView mountainScene = new MountainSceneView();
        mountainScene.display();
}

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
