//////////////////////////////////////////////////////////////////////////
//Abi Rose
//lab05
//Random Games Java Program
//Program Should
//  use scanner to obtain from the user one of three choices for a game
//      1)Roulette, user will enter "R" "r" 
//      2)Craps, user will enter "C" "c" 
//      3)picking a card from a deck of playing cards, user will enter "P" or "p"
//  if "R" or "r"
//      program will print 0,00,1,2,...,36
//  if "C" or "c"
//      program should print random outcome of two rolls of a die
//  if "P" or "p"
//      program should print a random draw from a deck of cards

import java.util.Scanner;

//define a class
public class RandomGames {

    //add main method
        public static void main(String [] args) {
        
        //defining variables
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.println(
            "Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        String randomGame= myScanner.next();
        String R="", r="", C="", c= "",P="", p=""; 
        
        if (randomGame==R | randomGame==r); {
            System.out.println("Roulette game is not yet implemented");
            System.exit(0);   
        }
        if (randomGame==P | randomGame==p); {
            System.out.println("Roulette game is not yet implemented");
            System.exit(0);
        }
            
            
        
        if (randomGame==C | randomGame==c); {
            int roll1= (int)(Math.random()*6)+1;
            int roll2= (int)(Math.random()*6)+1;
            int total= roll1+roll2;
            
            System.out.println(roll1 + "+" + roll2 + "=" + total);
        }
        
        
       
        } //end of main method
        } //end of class
