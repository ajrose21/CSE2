///////////////////////////////////////////////////////////////////
//Abi Rose
//Boola Boola Java Program
//
//Program Should:
//  ask user for three boolean variables using scanner
//      true or false will randomly be assigned
//  combine the three values randomly with && or || and store the result
//
//  first compile the program
//      javac.BoolaBoola.java
//  run the program
//      java BoolaBoola//

import java.util.Random; //importing Scanner

//define a class
public class BoolaBoola{
    //add main method
    public static void main (String [] args) {
        
    //defining variables/ introducing Scanner    
    
    boolean a= false;
    boolean b=false;
    boolean c=false;
    
    Random rand=new Math.Random();
    a = rand.nextInt();

    

    if (a=1) {
        a=true;
    } else {
        a=false;
    }
    /*randomly assign two numbers, if 1 a=true else a=false
    boolean b=
    randomly assign two numbers, if 1 a=true else a=false
    boolean c=
        randomly assign two numbers, if 1 a=true else a=false


if operator =1, equals &&, else equals ||
    */
    } //end main method
} //end class