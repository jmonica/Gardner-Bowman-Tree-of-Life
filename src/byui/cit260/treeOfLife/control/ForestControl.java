
package byui.cit260.treeOfLife.control;


public class ForestControl {
    public double calcHeightOfTree(double distance, double fists){
    if (distance<50|| 100<distance){
    return -1;
    }
    if (fists<1 || 5<fists){  
    return -1;
    }
    
    double tall = Math.tan(.1745* fists);
    double theHeight = Math.round(distance * tall);
    
    return theHeight;
    }
}
