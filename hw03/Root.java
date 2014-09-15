//////////////////////////////////////////////////////////////
//Abi Rose
//hw03
//Root Java Program
//
//  Program Should:
//      -use scanner to choose a number
//      -print out a crude estimate of the cube root of the number 
//          and the value of the crude guess when cubed
//      
//  first compile the program
//      javac.Root.java
//  run the program
//      java Root//

import java.util.Scanner; //importing scanner that user will use for program

//define a class
public class Root{
    
    //  add main method
            public static void main(String [] args) {
                
            //defining variables; introducing Scanner
            Scanner myScanner;
            myScanner = new Scanner( System.in);
            
            //Ask user to choose the number that this program will work off of
            //Print the following input 
            System.out.println("Enter a number: ");
            double x=myScanner.nextDouble();
            
            //identify first guess to base the rest of the program on
            double guess1=x/3;
            //Print the following input to show what first guess is
            System.out.println("The first guess is " +guess1+
            " and the cube of this guess is " +guess1*guess1*guess1);
            
            //improve guess using Newton-Raphson method
            double guess2=(((2*guess1)+(x/(guess1*guess1)))/3);
            double guess3=(((2*guess2)+(x/(guess2*guess2)))/3);
            double guess4=(((2*guess3)+(x/(guess3*guess3)))/3);
            double guess5=(((2*guess4)+(x/(guess4*guess4)))/3);
            
           //Print what the fifth guess is
            
            System.out.println("The cube root is about "+guess5+
            " and the cube of this is "+(guess5*guess5*guess5));
            
            /*this method should be used with more than 5 guesses to show
            how reliable it actually is because the larger the input is
            the more guesses the program would require*/
          
           
      
            } //end of main method
            
} //end of class

         