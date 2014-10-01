//////////////////////////////////////////////////////////////
//Abi Rose
//Course Number Java Program
//
//Program Should:
//  prompt user to enter a 6 digit number
//  needs to be within 186510 and 201440
//  program will say the year and semester when the course was offered
//
//first compile the program
//  javac.CourseNumber.java
//run the program
//  java CourseNumber//

import java.util.Scanner; //importing Scanner

//define a class
public class CourseNumber{
    //add main method
    public static void main (String [] args) {
        
    //defining variables/ introducing Scanner
    Scanner myScanner;
    myScanner= new Scanner( System.in);
    
    //Print the following input
    System.out.println("Enter a six digit number giving the course number: ");
    int courseNumber=myScanner.nextInt(); //user choose course number
    
    int year= (int) courseNumber/100; //divides the course number by 100 (ex:186510/10=1865.10)
    int semester= courseNumber- (year*100); //converts to int (ex:1865.10 to 1865)
    
        
        
        if (year<1865 || year >2014) {
            System.out.println("The number was outside the range [186510,201440]");
            System.exit(0);
        } //setting the boundaries for years
        if (semester !=10 && semester!= 20 && semester!=30 && semester!=40){
            System.out.println(semester +" is not a legitimate semester");
        } //setting the boundaries for semesters 
        
        //setting the acceptable last two digits for the semester options
        if (semester==10) {
            System.out.println("The course was offered in the Spring semester of " +year);
        }
        
        if (semester==20) {
            System.out.println("The course was offered in the Summer 1 semester of " +year);
        }
        
        if (semester==30) {
            System.out.println("The course was offered in the Summer 2 semester of " +year);
        }
        
        if (semester==40) {
            System.out.println("The course was offered in the Fall semester of " +year);
        }
        
        
        

        
    } //end main method
} // end class