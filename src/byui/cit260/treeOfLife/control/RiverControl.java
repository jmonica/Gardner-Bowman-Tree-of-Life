/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.control;

/**
 *
 * @author MonicasApple
 */
public class RiverControl {
    
    public double calcCircumference (double radius){
        if (radius < 3 || 6 < radius){
		return -1;
        }
        
	double circumference = (radius*2*3.14);
	return circumference;
    }
}
