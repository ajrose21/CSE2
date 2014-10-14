/////////////////////////////////////////////////////////////////
//Abi Rose
//lab02
//Cyclometer Java Program
//
//  Program Should:
//      print the number of minutes for each trip
//      print the number of counts for each trip
//      print the distance of each trip in miles
//      print the distance for the two trips combined
//
//  first compile the program
//      javac.Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer{
    
    //add main method
        public static void main(String [] args) {
            
        //defining variables
            
        int secsTrip1=480; //
        int secsTrip2=3220; //
        int countsTrip1=1561; //
        int countsTrip2=9037; //
        double wheelDiameter=27.0, //
        PI=3.14159, //
        feetPerMile=5280, //
        inchesPerFoot=12, //
        secondsPerMinute=60; //
        double distanceTrip1, distanceTrip2,totalDistance;
        
        //Print the following calculations
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute) +
            " minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+
            " minutes and had "+countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        
    //Above gives ditance in inches
    //(for each count, a rotation of the wheel travels the diameter in 
    //inches time PI)
        
        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+"miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
                
        //run the calculations; store the values
        
        
        }   //end of main method
}   //end of class
