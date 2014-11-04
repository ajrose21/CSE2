///////////////////////////////////////////////////////////
//Abi Rose
//hw09
//Blocked Again Java Program



import java.util.Scanner;

public class BlockedAgain{
    
    public static void main(String []s){
    int m;
    System.out.println("Enter an in int between 1 and 9, inclusive: ");
    Scanner myScanner=new Scanner(System.in);
	Scanner scan=new Scanner(System.in);
	m=myScanner.nextInt();

    //force user to enter int in range 1-9, inclusive.
    getInt(m); //this is still using the original m, for some reason it isn't changing from the getInt methood
    allBlocks(m);
}
    
    public static int getInt(int x) {
        Scanner myScanner=new Scanner(System.in);
    	Scanner scan=new Scanner(System.in);
        
        //makes sure integers are within the specified range
        if (x<0 || x>9) {
        System.out.println("You did not choose an int between [0, 9], try again:");
    	x=myScanner.nextInt();
        }
        /*else if(!myScanner.hasNextInt()) {
            System.out.println("You did not choose an int between [0, 9], try again:");
        	x=myScanner.nextInt();
            
        }*/ //this part isn't working, requires, user to enter their int again, and doesn't help with non integers
        
        else {
            x=x;
        }
        return x;
    }
    public static void allBlocks(int x) {
        String z="";
        int v=0;
        int u=0;
        int t=0;
        
        for (t=1; t<=x; t++) {
            for (v=1; v<=t; v++) {
            System.out.print(t);
            int y=1;
                for (y=1; y<(t+(t-1)); y++) {
                z+=t;
                System.out.print(t);
            }
        System.out.println("");
        }
        for (u=0; u<(t+(t-1)); u++) {
                System.out.print("-");
                }
        System.out.println("");        
        }
    }    
    }
    
