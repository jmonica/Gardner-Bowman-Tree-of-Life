/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.model.ArmorShop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import treeoflife.TreeOfLife;

/**
 *
 * @author MonicasApple
 */
class ArmorShopView extends ArmorShop {
    
    protected final BufferedReader keyboard = TreeOfLife.getInFile();
    protected final PrintWriter console = TreeOfLife.getOutFile();
    
    public ArmorShopView() {
        System.out.println( "\n\n------------------------------------"
                            +"\n|        Make your selection         |"
                            +"\n--------------------------------------"
                            +"\n| ARMOR SHOP                         |"
                            +"\n--------------------------------------"
                            +"\nH - Helmet of Salvation -----------$10"
                            +"\nF - Shield of Faith----------------$10"
                            +"\nT - Belt of Truth------------------$10"
                            +"\nP - Feet shod with Peace-----------$10"
                            +"\nS - Sword 'Word of God'------------$10"
                            +"\nR - Breastplate of Righteousness---$10"
                            +"\nE - Exit"
                            +"\n--------------------------------------");
        }
    public boolean doAction(Object obj){
        
        try {
            String value = keyboard.readLine();
            
            value = value.toUpperCase();//convert to all upper case
            char choice = value.charAt(0); //get the first character entered
            
            switch (choice){
                case 'H':
                    System.out.println("Helmet of Salvation is $10");
                    this.main();
                    break;
                case 'F':
                    System.out.println("Shield of Faith is $10");
                    this.main();
                    break;
                case 'T':
                    System.out.println("Belt of Truth is $10");
                    this.main();
                    break;
                case 'P':
                    System.out.println("Feet shod with Peace is $10");
                    this.main();
                    break;
                case 'S':
                    System.out.println("Sword 'Word of God'is $10");
                    this.main();
                    break;
                case 'R':
                    System.out.println("Breastplate of Righteousness is $10");
                    this.main();
                    break;
                case 'E':
                    return true;
                default:
                    this.console.println("\n***Invalid selection *** Try again");
                    break;
            }
            
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
        return false;
    }   
    
    
    public void main(){
        try {
            int totalSale = 0;
            
            this.console.println("Enter your how many you want to buy");
            String userResponse = this.keyboard.readLine();
            totalSale = Integer.parseInt(userResponse);
            if(totalSale < 1){
                totalSale = totalSale + 0;
            }
            else if (totalSale < 2){
                totalSale = totalSale+10;
            }
            else if (totalSale < 3){
                totalSale = totalSale+20;
            }
            else if (totalSale < 4){
                totalSale = totalSale+30;
            }
            else if (totalSale < 5){
                totalSale = totalSale+40;
            }
            else if (totalSale < 6){
                totalSale = totalSale+50;
            }
            else if (totalSale < 7){
                totalSale = totalSale+60;
            }
            else{
                ErrorView.display(this.getClass().getName(),
                        "You must enter a value");
            }
            
            this.console.println("Total cost is: " +totalSale);
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
        }
    }
    

}
    
