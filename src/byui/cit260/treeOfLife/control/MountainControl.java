
package byui.cit260.treeOfLife.control;


public class MountainControl {
    public double calcHeightOfMountain(double time){
        if  (time < 1 || time > 10){
	return -1;
        }
	double height = (16.1 * Math.pow(time, 2));
	
        return height;
    }
}