/////////////////////////////////////////////////////////////////////////////
//Abi Rose
//hw06
//Root Java Program
//Program Should:
//  prompt user to enter a double >0
//  use the bisection method to compute the square root

import java.util.Scanner; //importing scanner

//define a class
public class Root {
    //add main method
    public static void main (String [] args) {
    
    //defining variables/introducing Scanner
    Scanner myScanner;
    myScanner= new Scanner (System.in);
    
    //print the following input
    System.out.println("Enter a double > 0: ");
    double x=myScanner.nextDouble(); //user enters the number they want the square root of
    double low=0;
    double high=1+x;
    double middle=(high+low)/2;
    
    while ((high-low)<(.0000000000001*(1+x))) {
        if ((middle*middle)>x) {
        high=middle;
        low=low;
        }   
        if ((middle*middle)<x) {
            low=middle;
            high=high;
        }
        else {
            low=low;
            middle=middle;
            high=high;
        }
    }
    
    System.out.println("The approximate square root is: "+middle);
    
    

    
    } //end of the main method
} //end of class

