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

   
    @Override
    public boolean doAction(Object obj) {
                
        String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered

        switch (choice){
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
                return true;
            default:
                this.console.println("\n*** Invalid selection***");
                break;
        }
        return true;
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
    
}
