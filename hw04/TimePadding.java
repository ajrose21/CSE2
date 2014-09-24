////////////////////////////////////////////////////////////////
//Abi Rose
//hw04
//Time Padding Java Program
//
//Program Should:
//  prompt user to enter a positive integer representing seconds
//  convert the seconds to a padded number
//
//first compile the program
//  javac.TimePadding.java
//run the program
//  java TimePadding//

import java.util.Scanner; //importing Scanner

//define a class
public class TimePadding{
    
    //add main method
        public static void main(String [] args) {
            
        //defining variables/ introducing Scanner
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        
        //print the following input
        System.out.println("Enter the time in seconds: ");
        int Seconds=myScanner.nextInt(); //user chooses number of seconds
        
        
        int hour= (int) Seconds/3600; 
        //divide by 3600 to get amount of hours and convert to int
        int minutes= (int) ((Seconds-(hour*3600))/60); 
        //total number of seconds- number of hours, all divided by 60 to get number of minutes
        int seconds= (int) ((Seconds-(hour*3600)-(minutes*60)));
        //total number of seconds - number of hours and number of minutes
                
                
        String hr = (hour<10 ? "0":"") + hour; 
        //when hours are less than 10, for proper appearance we want a 0 in front
        String min = (minutes<10 ? "0":"") +minutes;
        //when minutes are less than 10, for proper appearance we want a 0 in front
        String sec = (seconds<10 ? "0":"") +seconds;
        //when seconds are less than 10, for proper appearance we want a 0 in front
        
        System.out.println("The time is "+ hr+":"+min+":"+sec);
        //total time in hh:mm:ss form
            
        } //end of main method
} //end of class


