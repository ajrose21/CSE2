//////////////////////////////////////////////////////////////////////////////
//Abi Rose
//lab 07
//Loop The Loop Java Program
//Program Should: 
//  use a loop to print out number of stars printed on a line
//  make a second loop thats print out stars in a pattern
//  make a third loop the integrates Scanner and print outs number of stars 

//first compile the program
//  javac LoopTheLoop.java
//run the program
// java LoopTheLoop


import java.util.Scanner;

//define a class
public class LoopTheLoop {

    //add main method
    public static void main(String [] args) {

//defining variables
Scanner myScanner;
myScanner = new Scanner(System.in);
int nStars=10;
int i=10;

while (i==nStars){
    System.out.println("**********");
    i++;
    System.out.println("");
}
  
int j=1;
while (j <= nStars) {
    int n = 0;
    while(n<j){
        System.out.print("*");
        n++;
    }
    System.out.println("");
    j++;
    
}

System.out.println("Enter an integer between 1 and 15: ");
int myStars=myScanner.nextInt();


if (myStars <=1 || myStars>=15) {
    System.out.println("Your int was not in the correct range");
}
int k=1;
while (k<=myStars) {
    int m = 0;
    while (m<k) {
        System.out.print("*");
        m++;
    }
    System.out.println("");
    k++;
}


    }    
}    