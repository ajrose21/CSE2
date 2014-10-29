/////////////////////////////////////////////////////////////////
//Abi Rose
//hw08
//HW8 java program
//program should:
//  use methods

import java.util.Scanner;

//define a class
public class HW8{
	

    //add main method
    public static void main(String []arg){
    
    
    //first part determines whether or not to continue; uses method: input3
    String input3="";
	System.out.println("Enter 'C' or 'c' to continue, anything else to quit- ");
	Scanner myScanner=new Scanner(System.in);
	Scanner scan=new Scanner(System.in);
	input3=myScanner.next();
	getInput3(input3);
	System.out.println("You entered '"+input3+"'");
	 
	//second part determines if the user can enter y,Y,n,N and has five chances; uses method: input 2
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	String input2="";
	input2=myScanner.next();
	getInput2(input2); 
   	System.out.println("You entered '"+input2+"'");
    
    //third part determines if they choose an integer; uses method:input1
    int input=0;
	System.out.println("Choose a digit: 0123456789");
	input= myScanner.nextInt();
	getInput1(input);
	System.out.println("You entered '"+input+"'"); 
    }
    
    //method two determines if they chose a correct character
    public static void getInput2(String input2) {
        int i=0;
        String Y="Y";
        String y="y";
        String N="N";
        String n="n";
        
        //for loop gives them 5 tries
        for (i=0; i<5; i++) {
            
            if (input2.equals("Y") || input2.equals("y") || input2.equals("N") || input2.equals("n")) {
            input2=input2;
            }
            else {
                System.out.println("You did not choose a character from the list 'YyNn', try again");
                Scanner myScanner=new Scanner(System.in);
	            Scanner scan=new Scanner(System.in);
                input2=myScanner.next();
            }
            if (i==4) {
            System.out.println("You failed after 5 tries");
        }
        }
    
        
        
    }
    
    //input1 determines if they chose an integer
    public static void getInput1(int input) {
        if (input<0 || input >9) {
            System.out.println("you did not choose an acceptable digit");
            System.exit(0);
        }
        else {
            input=input;
        }    
        }
   
    //input 3 decides if they chose to continue or not
    public static void getInput3(String input3) {
        int i=0;
        int j=0;
        String C="C";
        String c="c";
    	
    	/* if (input3 != " ") {
    	    System.out.println("Try one character");
    	    Scanner myScanner=new Scanner(System.in);
	        Scanner scan=new Scanner(System.in);
            input3=myScanner.next();
    	} 
    	else { */
    	for (i=0; i<10; i++) {
    	if (input3.equals("C") || input3.equals("c")) {
            input3=input3;
    	}
    	else {
            System.out.println("You did not enter a character from the list 'Cc'; try again-");
            Scanner myScanner=new Scanner(System.in);
	        Scanner scan=new Scanner(System.in);
            input3=myScanner.next();
        
    	}
    	    
	
    }
    }    
}
/*}*/