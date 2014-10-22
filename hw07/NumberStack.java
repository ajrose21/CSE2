/////////////////////////////////////////////////////////////////
//Abi Rose
//hw07
//Number Stack java program
//Program Should:  
//  ask the user to input an int
//  print out a pattern three times
//  one with for, one with while, one with do while

import java.util.Scanner;

//define a class
public class NumberStack {
    
    //add main method
        public static void main(String [] args) {
            
        //defining variables
        Scanner myScanner;
        myScanner = new Scanner( System.in);
    
    
    //asking for number
    //setting up restrictions
    System.out.println("Enter an int between 0 and 9");
    int chosenNumber=myScanner.nextInt();
    if (chosenNumber>=9 || chosenNumber<=0) {
        System.out.println("unacceptable int");
        System.exit(0);
    }
    
    
    //for loop
    //can not figure out how to specify which number to print
    String x="";
    int k=0;
    int n=0;
    int l=0;
    for (n=1; n<=chosenNumber; n++) {
        int m=0;
        for (m=0; m<(n+(n-1)); m++) {
            x+=n;
            System.out.print(n);
            
        }
        System.out.println("");
            for (l=0; l<(n-1); l++) {
                System.out.println(x);
            }
                for (k=0; k<(n+(n-1)); k++) {
                    System.out.print("-");
                }    
        System.out.println("");
        } 
        
//while loop
//dashes inbetween not working the way I'd like them
//can not figure out how to specify which number to print
        
String y="";       
int a=0;
int d=0;
while (a<=chosenNumber) {
    int b=0;
    while (b<(a+(a-1))) {
        System.out.print(a);
        b++;
        y+=a;
    }
    int c=0;
    System.out.println("");
    while (c<(a-1)) {
        System.out.println(y);
        c++;
    }
    while (d<(a+(a-1))) {
        System.out.print("-");
        d++;
    }
        System.out.println("");
        a++;
}



//do while loop
//can't figure it out

//declaring ints
int e=0;
int f=0;
int g=0;

//do while nested loops
do {
    System.out.println("");
    e++;
    do {
        System.out.print(e);
        f++;
    do {
        System.out.print(e);
        g++;
    }
    while (g<(chosenNumber*2));  
    }
    while (f<(chosenNumber*2));
}
while (e<chosenNumber);
   

        } //end of main method
} //end of class
