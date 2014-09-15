////////////////////////////////////////////////////////////////////////
//Abi Rose
//
//hw03
//Four Digits Java Program
//
//  Program Should:
//      -prompt user to enter a double with four decimal places
//      -then print out only the first four digits to the right of the decimal
//  
//  First compile the program
//      javac.FourDigits.java
//  run the program
//      java FourDigits//

//import Scanner that will be used by the user for the program
import java.util.Scanner;

//define a class
public class FourDigits{
    
    //add main method
        public static void main(String [] args) {
            
        /*defining variables, using scanner to choose a variable to
        base this program off of*/
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Print the following, (prints what the user chooses to enter)
        //Prompts user to choose the number
        System.out.println("Enter a number (in the form xx.xxxx): ");
        double x=myScanner.nextDouble();
        
        //variables
        int digits=(int)x; //first casts the number as an int and changes name
        x-=digits; //leaves just the decimal places (orginal variable-(int)x))
        double digits2=(double)x*10000; //multiples by 10,000 to get out of decimals
        int finalDigits=(int)digits2; //casts as int to get rid of decimal places
        
        //Print the following solution 
        System.out.println("The four digits to the right of the decimal point are: "
        + finalDigits);
        
        
} //end of main method
} //end of class

