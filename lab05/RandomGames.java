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
import java.util.Random; //inputting random number generator

//define a class
public class RandomGames {

    //add main method
        public static void main(String [] args) {
        
        //defining variables
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        Random randomGenerator = new Random();
        int bettingNumber = randomGenerator.nextInt(39);
    
        System.out.println(
            "Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        String randomGame= myScanner.next();
        String R="", r="", C="", c= "",P="", p=""; 
        
        
        if (randomGame==R); {
            int rouletteNumber = randomGenerator.nextInt(39);
                    System.out.println(rouletteNumber);
                    System.exit(0);;
        }   
        
        if (randomGame==r); {
                int rouletteNumber = randomGenerator.nextInt(39);
                    System.out.println(rouletteNumber);
                    System.exit(0);;
        }   
        
        if (randomGame==P); {
               System.out.println("Picking game is not yet implemented");
                System.exit(0);
        }   
        
        if (randomGame==p); {
                System.out.println("Picking game is not yet implemented");
                System.exit(0);
        }   
        
        if (randomGame==C); {
                System.out.println("Craps game is not yet implemented");
                System.exit(0);
        }   
        
        if (randomGame==c); {
                System.out.println("Craps game is not yet implemented");
                System.exit(0);
        }   
        
        } //end of main method
        } //end of class
