/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeOfLife.view;

import byui.cit260.treeOfLife.model.ArmorShop;

/**
 *
 * @author MonicasApple
 */
class ArmorShopView extends ArmorShop {
    private Object keyboard;
    private Object console;

    public ArmorShopView() {
        System.out.println( "\n\n"
                            +"\n---------Make your selection----------"
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
    
    public void main(String[] args){
        double totalSale = 0;
        
        this.console.println("Enter your how many you want to buy");
        totalSale = this.keyboard.readLine();
        
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
       
        System.out.println("Total cost is: " +totalSale);
    }
    
    /*public boolean doAction(Object obj) {
        
        String value = (String)obj;
        
        value = value.toUpperCase();//convert to all upper case
        char choice = value.charAt(0); //get the first character entered
        
        switch (value){    
            case "H":
                System.out.println("Helmet of Salvation is $10");
                break;
            case "F":
                System.out.println("Shield of Faith is $10");
                break;
            case "T":
               System.out.println("Belt of Truth is $10");
                break;
            case "P":
                System.out.println("Feet shod with Peace is $10");
                break;
            case "S":
                System.out.println("Sword 'Word of God'is $10");
                break;
            case "R":
                System.out.println("Breastplate of Righteousness is $10");
                break;
            case "E":
                return true;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
        }
        return true;
    }*/
}
    
