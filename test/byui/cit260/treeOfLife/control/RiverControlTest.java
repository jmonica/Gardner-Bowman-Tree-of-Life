/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.control;

import byui.cit260.treeOfLife.exceptions.RiverControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gradygb
 */
public class RiverControlTest {
    
    public RiverControlTest() {
    }

    /**
     * Test of calcCircumference method, of class RiverControl.
     */
    @Test
    public void testCalcCircumference() throws RiverControlException {
        System.out.println("calcCircumference");
        
        /***************
         * Test case #1
         ***************/
        System.out.println("\tTest case#1");
        
        double radius = 4.0;
        
        RiverControl instance = new RiverControl();
        
        double expResult = 25.12;
        double result = instance.calcCircumference(radius);
        assertEquals(expResult, result, 0.0001);

         /***************
         * Test case #2
         ***************/
        System.out.println("\tTest case#2");
        
        radius = -2;
        
        expResult = -1;
        result = instance.calcCircumference(radius);
        assertEquals(expResult, result, 0.0001);
        
         /***************
         * Test case #3
         ***************/
        System.out.println("\tTest case#3");
        
        radius = 1;
        
        expResult = -1;
        result = instance.calcCircumference(radius);
        assertEquals(expResult, result, 0.0001);
        
         /***************
         * Test case #4
         ***************/
        System.out.println("\tTest case#4");
        
        radius = 10;
        
        expResult = -1;
        result = instance.calcCircumference(radius);
        assertEquals(expResult, result, 0.0001);
        
         /***************
         * Test case #5
         ***************/
        System.out.println("\tTest case#5");
        
        radius = 3;
        
        expResult = 18.84;
        result = instance.calcCircumference(radius);
        assertEquals(expResult, result, 0.0001);
        
         /***************
         * Test case #6
         ***************/
        System.out.println("\tTest case#6");
        
        radius = 6;
        
        expResult = 37.68;
        result = instance.calcCircumference(radius);
        assertEquals(expResult, result, 0.0001);
    }
    
}
