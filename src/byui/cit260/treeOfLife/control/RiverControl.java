
package byui.cit260.treeOfLife.control;


public class RiverControl {
    
    public double calcCircumference (double radius){
        if (radius < 3 || 6 < radius){
		return -1;
        }
        
	double circumference = (radius*2*3.14);
	return circumference;
    }

    public void display(double circumference) {
        System.out.println("The circumference is" + circumference);
    }
}
