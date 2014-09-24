///////////////////////////////////////////////////////////////////
//Abi Rose
//hw04
//Income Tac Java Program
//
//Program Should:
//  prompt the user to enter an int that gives the thousands of dollars
//      of income
//  write out the amount of tax on the income following this schedule:
//      <20, 5%
//      >=20 and <40, 7%
//      >=40 and <78, 12%
//      >=78, 14%
//
//first compile the program
//  javac.IncomeTax.java
//run the program
//  java IncomeTax//

import java.util.Scanner;   //importing Scanner that user will use

//define a class
public class IncomeTax {

//  add main method
        public static void main(String [] args) {
            
        //defining variables/ introducing Scanner
        Scanner myScanner;
        myScanner= new Scanner( System.in);
        
        //Print the following input
        
        System.out.println("Enter an int giving the number of thousands: ");
        int income= myScanner.nextInt(); //user enters income
        
        
        double taxPercent=.05; 
        //set a base value for the tax percent
        int tax1= (int) (taxPercent*100); 
        // convert tax percent to a whole number for appearance purposes
        
        if (income<0) {
            System.out.println("You did not enter a positive integer");
            System.exit(0);
        }
        //income needs to be a positive integer, end program otherwise
        
        else if (income>=78) {    
            taxPercent=14;
        } 
        else if (income>=40) {
            taxPercent=12;
        } 
        else if (income>=20) {
            taxPercent=7;
        } 
        else if (income<20) {
            taxPercent=5;
        }
        //sets tax percents for different levels of income
        double tax= (income*10*taxPercent);
        //formula to find tax based on the variables we have
        
        //print the following
        System.out.println("The tax rate on $" +income+",000" +" is "+(taxPercent)+
            "%, and the tax is $" + tax);
    
        
        
        } //end main method
} //end class
