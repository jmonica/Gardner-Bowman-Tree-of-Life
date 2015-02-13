
package byui.cit260.treeOfLife.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MonicasApple
 */
public class ForestControlTest {
    
    public ForestControlTest() {
    }

    /**
     * Test of calcHeightOfTree method, of class ForestControl.
     */
    @Test
    public void testCalcHeightOfTree() {
        System.out.println("calcHeightOfTree");
        
        /**********************
         * Test case #1
         **********************/
        System.out.println("\tTest case #1");
        
        /**Inputs*/
        double distance = 75.0;
        double fists = 3.0;
        
        
        ForestControl instance = new ForestControl();
        double expResult = 43.29139319262645;
        double result = instance.calcHeightOfTree(distance, fists);
        assertEquals(expResult, result, 0.0001);
        
        
        /**********************
         * Test case #2
         **********************/
        System.out.println("\tTest case #2");
        
        /**Inputs*/
        distance = 25.0;
        fists = 2.0;
        
        expResult = -1;
        result = instance.calcHeightOfTree(distance, fists);
        assertEquals(expResult, result, 0.0001);
        
        
        /**********************
         * Test case #3
         **********************/
        System.out.println("\tTest case #3");
        
        /**Inputs*/
        distance = 200.0;
        fists = 3.0;
        
        expResult = -1;
        result = instance.calcHeightOfTree(distance, fists);
        assertEquals(expResult, result, 0.0001);
        
        
        /**********************
         * Test case #4
         **********************/
        System.out.println("\tTest case #4");
        
        /**Inputs*/
        distance = 55.0;
        fists = 6.0;
        
        expResult = -1;
        result = instance.calcHeightOfTree(distance, fists);
        assertEquals(expResult, result, 0.0001);
        
        
        
        /**********************
         * Test case #5
         **********************/
        System.out.println("\tTest case #5");
        
        /**Inputs*/
        distance = 50.0;
        fists = 5.0;
        
        expResult = 59.56776151469365;
        result = instance.calcHeightOfTree(distance, fists);
        assertEquals(expResult, result, 0.0001);
        
        
        /**********************
         * Test case #6
         **********************/
        System.out.println("\tTest case #2");
        
        /**Inputs*/
        distance = 100.0;
        fists = 1.0;
        
        expResult = 17.629303202201584;
        result = instance.calcHeightOfTree(distance, fists);
        assertEquals(expResult, result, 0.0001);
    }
    
}
