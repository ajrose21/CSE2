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
System.out.println("[START]");
int i=1;
int sum=1;
for (i=1; i<7; i++) {
    System.out.println("["+sum+"]");
    sum=(sum+i);
}
System.out.println("[END]");



//defining variables

                   
int a=0;
int temp1=1;
for (a=0; a<4; a++) {
	if (a!=0){	
temp1=temp1*2;
}
for (int k=0; k<a+1; k++) {
	for (int l=0; l<k+1; l++) {
System.out.print(temp1);
}
System.out.println("");
}
}


    }
}
