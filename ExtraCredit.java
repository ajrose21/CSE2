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
//part 2b
int temp=1;
for ( int i=0; i<4; i++) {
    if (i!=0) {
        temp=temp*2; 
    }
    for (int j=0; j<i+1; j++) {
        for (int k=0; k<j+1; k++) {
    System.out.print(temp);
        }
    System.out.println("");
        
    }
    
}
    
}


}
