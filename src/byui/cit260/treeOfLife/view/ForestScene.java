
package byui.cit260.treeOfLife.view;

import static apple.laf.JRSUIConstants.Widget.MENU;
import byui.cit260.treeOfLife.control.RiverControl;
import java.util.Scanner;

/**
 *
 * @author MonicasApple
 */
public class ForestScene {
   public void display() {

char distance = ' ';
do {

System.out.println(MENU);

String input = this.getInput();

} while (distance != 'E');

}

private String getInput() {

Scanner keyboard = new Scanner(System.in);
boolean valid = false;
String distance = null;
String fists = null;

while (!valid) {
System.out.println("Type the distance that you are from the tree.");

distance = keyboard.nextLine();
distance = distance.trim();

if (distance.length() != 1) {
System.out.println("Invalid selection");

}

while (!valid) {
System.out.println("Type the amount of fist high the tree is.");

fists = keyboard.nextLine();
fists = fists.trim();

if (fists.length() != 1) {
System.out.println("Invalid selection");

}
else {
RiverControl ForestControl = new RiverControl();
}
}
return height();

} 

