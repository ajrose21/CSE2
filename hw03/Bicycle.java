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
        minutesperHour=60;
        
        //changing distance variables so there are only two decimal places
        double distance1=countsTrip*wheelDiameter*PI*(1/inchesperFoot)*(1/feetPerMile);
        int miles=(int)distance1, //whole mile number
        tens1=(int)(distance1*10)%10,
        hundreds1=(int)(distance1*100)%100; //storing digits to the right of finalDistance
      
        
        //changing time variables so there are only two decimal places
        double minuteTime=secsTrip*(1/secondsperMinute);
        int minuteTime2= (int)minuteTime,
        tens4=(int)(minuteTime*10)%10,
        hundreds4=(int)(minuteTime*100)%100;
        
        //changing time variables so there are only two decimal places
        double time1=secsTrip*(1/secondsperMinute)*(1/minutesperHour);
        int time2= (int)time1,
        tens2=(int)(time1*10)%10,
        hundreds2=(int)(time1*100)%100;
        
        //changing mph variables so there are only two decimal places
        double mph1=distance1/time1;
        int mph2= (int)mph1,
        tens3=(int)(mph1*10)%10,
        hundreds3=(int)(mph1*100)%100;
        

//Print the statement below which shows the calculations needed
        System.out.println("The distance was "
        +miles+"."+tens1+hundreds1+ " miles.");
        System.out.println("The distance took "
        +minuteTime2+"."+tens4+hundreds4+" minutes.");
        System.out.println("The average mph was "+mph2+"."+tens3+hundreds3+".");
        
        } //end of main method
} //end of class