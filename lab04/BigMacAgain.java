///////////////////////////////////////////////////////////////////
//Abi Rose
//lab04 Big Mac Java Program 2
//
//Program Should:
//  use Scanner to obtain how many Big Macs the user wants
//  use Scanner to see if user wants an order of fries or not
//  print out total cost of meal
//
import java.util.Scanner;

//define a class
public class BigMacAgain {
    
    //add main method
        public static void main(String [] args) {
            
        //defining variables
        Scanner myScanner;
        myScanner = new Scanner( System.in);
        
        
        
        //print the following
        
        System.out.println(
            "Enter the number of Big Macs (integer >0): ");
            
        int nBigMacs= myScanner.nextInt();
            if(!myScanner.hasNextInt()) {
           
                System.out.println(
                "You did not enter an integer");
            }
              //leaves the program
        
        double costBigMac= nBigMacs*2.22;
       
        
        System.out.println("You ordered "+nBigMacs+ 
            " for a cost of $"+ (costBigMac));
        
        System.out.println("Do you want an order of fries (Y/y/N/n)?");
        
        String fries= myScanner.next();
        
        if(fries.equals("Y") || fries.equals("y")){
            costBigMac += 2.15;
        }
        else if(fries.equals("N") || fries.equals("n")){
            
        }
        else{
            
        }
      
        
       
                
                
        } 
} 
