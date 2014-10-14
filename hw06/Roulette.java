/////////////////////////////////////////////////////////////////////////////
//Abi Rose
//hw06
//Roulette Java Program
//Program Should:
//  use random Math.random()) to simulate this person’s betting on 100 spins
//  run the simulation 1000 times; collect data on the outcome
//  compute the number of times the number never comes up
//  compute the number of times they walk away with a profit 
//  compute total winnings

//first compile the program
//  javac Roulette.java
//run the program
//  java Roulette

import java.util.Random; //inputting random number generator

//define a class
public class Roulette {
    
    //add main method
    public static void main (String [] args) {
        
//defining variables
    Random randomGenerator = new Random();
    int bettingNumber = randomGenerator.nextInt(39);
    int randomNumber=1; //can be any integer between 00 and 38 
    int winning= 0; //declaring variable to be used later
    int losing=0; //declaring variables to be used later
    int numberSpins=0; //declaring variable to used for while loop
    
//this loop will run through 1000 spins 
while (numberSpins<1000) {
    if (bettingNumber==randomGenerator.nextInt(39)) { //if the random number generator produces a 3
    winning++; //this will represent a win
}
else { //if any number other than 3 is produced
    losing++; //this will represent a loss
}
numberSpins++; //after each round, the number of spins increases by 1, until it is greater than 1000
}
System.out.println("The number of times you won is "+winning +
    " and the number of times you lost is "+losing);
System.out.println("The total winnings are $"+ 36*winning); //for each win, you get $36

//if there are more than 30 wins out of 1000, that is the same as saying if there are more than 3 wins out of 100
//this is represented by the new variable winning2
int winning2=0;
winning2=(int) (winning/10);
if (winning2>=3) {
    System.out.println("The number of times you win a profit in one session of 100 spins is "+(winning2));
} else {
    System.out.println("The number of times you win a profit in one session of 100 spins is 0");    
}
//if you don't win 3/100 times, then you get zero profit
if (winning2<3) {
    System.out.println("The number of times you lose everything is "+winning2);
} else {
    System.out.println("The number of times you lose everything is 0");
}




    } //end of main method
} //end of class