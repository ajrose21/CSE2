///////////////////////////////////////////////////////////////////
//Abi Rose
//Burger King Java Program
//
//Program Should:
//  prompt user to choose a burger, soda, or fries
//      if burger, ask user what fixings
//      if soda, ask what kind of soda
//      if fries, ask what size
//
//first compile the program
//      javac.BurgerKing.java
//run the program
//      java BurgerKing

import java.util.Scanner; //importing scanner

//defining a class
public class BurgerKing {
    //add main method
    public static void main (String [] args) {
    
    //defining variables/introducing Scanner
    Scanner myScanner;
    myScanner= new Scanner( System.in);
    
    //print the following input, user choice between burger, soda, or fries
    System.out.println("Enter a letter to indicate a choice of: Burger (B or b), Soda (S or s), or Fries (F or f): " );
    String choice1=myScanner.next(); //user chooses what they want from Burger King
    // declares variables to use later
    String choice2="";
    String choice3="";
    String choice4="";
    
    //first switch case
    switch (choice1) {
        case 'b' + "":
        case 'B' + "": 
            System.out.println("Enter A or a for 'all the fixings', C or C for cheese, or N or n for none of the above");
            choice2=myScanner.next();
            break;
        case 'S' + "":
        case 's' + "":
            System.out.println("Do you want Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m)? ");
            choice3=myScanner.next();
            break;
        case 'F' + "":
        case 'f' + "":
            System.out.println("Do you want a large (L or l) or small (S or s) order of fries?");
            choice4=myScanner.next();
            break;
        default: 
            System.out.println("You did not enter B, b, S, s, F, or f");
            break;
    }
    //switch case for burger choice
    switch (choice2) {
        case 'A' + "":
        case 'a' + "":
            System.out.println("You ordered a burger with all of the fixings");
            break;
        case 'C' + "":
        case 'c' + "":
            System.out.println("You ordered a burger with cheese");
            break;
        case 'N' + "":
        case 'n' + "":
            System.out.println("You ordered a plain burger");
            break;
        default: 
            System.out.println("You did not enter A, a, C, c, N, or n");
            break;    
    }        
    //switch case for soda
    switch (choice3) {
        case 'P' + "":
        case 'p' + "":
            System.out.println("You ordered a Pepsi");
            break;
        case 'C' + "":
        case 'c' + "":
            System.out.println("You ordered a Coke");
            break;
        case 'S' + "":
        case 's' + "":
            System.out.println("You ordered a Sprite");
            break;
        case 'M' + "":
        case 'm' + "":    
            System.out.println("You ordered a Mountain Dew");
            break;
        default: 
            System.out.println("You did not enter P, p, S, s, C, c, M, or m");
            break;    
    }
    
    //switch case for fries
    switch (choice4) {
        case 'L' + "":
        case 'l' + "":
            System.out.println("You ordered large fries");
            break;
        case 'S' + "":
        case 's' + "":
            System.out.println("You ordered small fries");
            break;
        default: 
            System.out.println("You did not enter L, l, S, or s");
            break;
    }

       
           
            
         
    
    
    } //end of main method
} //end of class

