///////////////////////////////////////////////////////////
//Abi Rose
//hw04
//Month Java Program
//
//Program Should
//  prompt user to enter an integer that represents a month
//  if they enter 2, they must then display the year
//  the program will display the amount of days in that month
//
//first compile the program
//  javac.month2.java
//run the program
//  java month2

import java.util.Scanner; //importing Scanner

//define a class
public class Month {
    
    //add main method
    public static void main (String [] args) {
        
    //defining variables/introducing scanner
    Scanner myScanner;
    myScanner=new Scanner( System.in);
    
    //print the following input
    System.out.println("Enter an int giving the number of month (1-12): ");
    int Month=myScanner.nextInt(); //user chooses the month they want
    
    
    //for all months but february, simple if statements are used
    if (Month==1) {
        System.out.println("This month has 31 days.");
    }
    if (Month==3) {
        System.out.println("This month has 31 days.");
    }    
    if (Month==5) {
        System.out.println("This month has 31 days.");
    }
    if (Month==7) {
        System.out.println("This month has 31 days.");
    }
    if (Month==8) {
        System.out.println("This month has 31 days.");
    }
    if (Month==10) {
        System.out.println("This month has 31 days.");
    }
    if (Month==12) {
        System.out.println("This month has 31 days.");
    }
    if (Month==4) {
        System.out.println("This month has 30 days.");
    }if (Month==6) {
        System.out.println("This month has 30 days.");
    }
    if (Month==9) {
        System.out.println("This month has 30 days.");
    }
    if (Month==11) {
        System.out.println("This month has 30 days.");
    }
    
    //for february, it is necessary to enter the year
    if (Month==2) {
            System.out.println("Enter an int giving the year: ");
                int Year=myScanner.nextInt();
                
                //boolean now needed to determine if it is a leap year or not
                    boolean leapYear= ((Year% 4==0) && (Year% 100!=0) || (Year %400==0));
                        if (leapYear) {
                            System.out.println("This month has 29 days");
                        }    
                        else {
                            System.out.println("This month has 28 days");
                        }    
    }
    
    //there are only 12 months, so anything greater needs to be ignored
    if (Month>12) {
        System.out.println("You did not enter an int between 1 and 12.");
        System.exit(0);
    }
    } //end main method
} //end class