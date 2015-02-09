/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MonicasApple
 */
public class MountainControlTest {
    
    public MountainControlTest() {
    }

    /**
     * Test of calcHeightOfMountain method, of class MountainControl.
     */
    @Test
    public void testCalcHeightOfMountain() {
        System.out.println("calcHeightOfMountain");
        
        
        /**********************
         * Test case #1
         **********************/
        System.out.println("\tTest case #1");
        
        double time = 5.0;
        
        MountainControl instance = new MountainControl();
        
        
        double expResult = 402.5;
        double result = instance.calcHeightOfMountain(time);
        
        
        assertEquals(expResult, result, 0.0001);
        
        /**********************
         * Test case #2
         **********************/
        System.out.println("\tTest case #2");
        
        time = 0;
        
        expResult = -1;
        
        result = instance.calcHeightOfMountain(time);
        
        assertEquals(expResult, result, 0.0001);
        
        
        
        /**********************
         * Test case #3
         **********************/
        System.out.println("\tTest case #3");
        
        time = 11;
        
        expResult = -1;
        
        result = instance.calcHeightOfMountain(time);
        
        assertEquals(expResult, result, 0.0001); 
        
        /**********************
         * Test case #4
         **********************/
        System.out.println("\tTest case #4");
        
        time = -6;
        
        expResult = -1;
        
        result = instance.calcHeightOfMountain(time);
        
        assertEquals(expResult, result, 0.0001); 
        
        /**********************
         * Test case #5
         **********************/
        System.out.println("\tTest case #5");
        
        time = 1;
        
        expResult = 16.1;
        
        result = instance.calcHeightOfMountain(time);
        
        assertEquals(expResult, result, 0.0001); 
        
        
        /**********************
         * Test case #6
         **********************/
        System.out.println("\tTest case #2");
        
        time = 10;
        
        expResult = 1610;
        
        result = instance.calcHeightOfMountain(time);
        
        assertEquals(expResult, result, 0.0001);

    }
    
}
