///////////////////////////////////////////////////////////
//Abi Rose
//Big Mac Java Program
//
//Program Should:
//  compute and print the cost of some Big Macs
//Uses Scanner to:
//  find out how many Big Macs
//  cost per Big Mac
//  add tax percentage (dependant on state)

import java.util.Scanner;

//  define a class
public class BigMac {
    
    //add main method
        public static void main(String [] args) {
            
        //defining variables
        Scanner myScanner;
        myScanner = new Scanner( System.in);
        
        //Print the following input
        
        System.out.println(
            "Enter the number of Big Macs(an integer>0): ");
        
        int nBigMacs= myScanner.nextInt();
        
        System.out.println(
            "Enter the cost per Big Mac as "+" a double (in the form xx.xx): ");
        
        double bigMac$=myScanner.nextDouble();
        
        System.out.println(
            "Enter the percent tax as a whole number (xx): ");
            
        double taxRate=myScanner.nextDouble();
        
        taxRate/=100; //need proportion, not percent
        
        //Print the following output
        double cost$;
            int dollars, //whole dollar amounts
                dimes, pennies; //storing digits to the right of cost$
        cost$=bigMac$*nBigMacs*(1+taxRate);
        //get whole amount, drop decimals
        dollars= (int)cost$;
        //get dimes amount
        dimes= (int)(cost$*10)%10;
        pennies= (int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+ "Big Macs, at $"+ bigMac$
        +"per Big Mac, with a "+ "sales tax of "+(int)(taxRate*100) + 
        "%, is $"+dollars+'.'+dimes+pennies);
        
                
        } //end of main method
} //end of class