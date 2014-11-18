/////////////////////////////////////////////////////////////////
//Abi Rose
//Extra Credit Assignment
//Fall 2012 Exam 2 #2
//Extra Credit Java Program

//  first compile the program
//      javac ExtraCredit.java
//  run the program
//      java ExtraCredit//

//define a class
public class ExtraCredit{
    
//  add main method
        public static void main(String [] args) {

//part a
//System.out.println("[START]");
//int i=1;
//int sum=1;
//for (i=1; i<7; i++) {
//    System.out.println("["+sum+"]");
//    sum=(sum+i);
//}
//System.out.println("[END]");



//defining variables
int x=0;
int y=0;
int z=0;
int temp=1;
    
    for (x=0; x<4; x++) {
        if (x!=0){
        temp=(temp*2);
        }
        for (y=1; y<x+1; y++) { 
        temp=temp;
        System.out.println(temp);
        }
        for (z=1; z<y+1; z++) {      
        System.out.print(temp);
        }
    System.out.println(" ");
    }
   
    
    }
}



