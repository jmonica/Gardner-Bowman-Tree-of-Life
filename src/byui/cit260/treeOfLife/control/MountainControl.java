
package byui.cit260.treeOfLife.control;

import byui.cit260.treeOfLife.exceptions.MountainControlException;


public class MountainControl {
    
    public void calcHeightOfMountain(double time)
            throws MountainControlException{
        if  (time < 1 || time > 10){
            throw new MountainControlException(time + " seconds is too long."
                                            + "The rope you will need is too long."
                                            + "find a different cliff.");
        }
	double height = (16.1 * Math.pow(time, 2));
    }

 
}