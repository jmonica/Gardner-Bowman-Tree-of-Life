
package byui.cit260.treeOfLife.control;

import byui.cit260.treeOfLife.exceptions.RiverControlException;


public class RiverControl {
    
    public void calcCircumference (double radius) 
            throws RiverControlException{
        if (radius < 3 || 6 < radius){
            throw new RiverControlException("Cannot use that tree."
                                            + radius + "is not wide enough to"
                                            + "across the river");
        }
        
	double circumference = (radius*2*3.14);
    }

}
