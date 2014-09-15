///////////////////////////////////////////////////////////
//Abi Rose
//hw03
//Bicycle Java Program
//
//  Program Should:
//      use Scanner to get values
//      use these values to:
//              -compute and print distance traveled
//              -compute and print average miles per hour
//
//  first compile the program
//      javac.Bicycle.java
//  run the program
//      java Bicycle//

import java.util.Scanner; //importing Scanner that user will use for program to work

//define a class
public class Bicycle{
    
//  add main method
        public static void main(String [] args) {
        
            
        //defining variables/ introducing Scanner
        Scanner myScanner;
        myScanner = new Scanner( System.in);
        
        //Print the following input that the user will use to choose their values
        System.out.println(
                "Enter the number of of counts (an integer>0): ");
        int countsTrip=myScanner.nextInt();
        
        //Print the following input that the user will use to choose their values
        System.out.println(
                "Enter the number of seconds (an integer>0): ");
        int secsTrip=myScanner.nextInt();
        
        //defining constant variables need for computations
        double wheelDiameter=27.0,
        PI=3.14159,
        feetPerMile=5280,
        inchesperFoot=12,
        secondsperMinute=60,
        minutesperHour=60,
        finalDistance=countsTrip*wheelDiameter*PI*inchesperFoot*feetPerMile,
        finalTime=secsTrip*(1/secondsperMinute)*(1/minutesperHour);
        double distanceTrip;
        
        

//Print the statement below which shows the calculations needed
        System.out.println("The distance was "
        +countsTrip*wheelDiameter*PI*inchesperFoot*feetPerMile+ " miles.");
        System.out.println("The distance took "
        +secsTrip*(1/secondsperMinute)*(1/minutesperHour)+" hours.");
        System.out.println("The average mph for the trip was "+
        (finalDistance/finalTime));
        } //end of main method
} //end of class