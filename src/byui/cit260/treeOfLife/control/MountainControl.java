
package byui.cit260.treeOfLife.control;

import byui.cit260.treeOfLife.exceptions.MountainControlException;


public class MountainControl {
    public double calcHeightOfMountain(double time){
        if  (time < 1 || time > 10){
	throw new MountainControlException(time + " seconds is too far down."
                                            + "The rope you will need is too long."
                                            + "find a different cliff.");
        }
	double height = (16.1 * Math.pow(time, 2));
	
        return height;
    }
}