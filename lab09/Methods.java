//Abi Rose
//lab09
//Methods Java Program
//Goal: practice writing methods

import java.util.Scanner;
public class Methods{
  public int getInt(int a,int b,int c) {
      Scanner myScanner;
      myScanner = new Scanner(System.in);
      myScanner.nextInt();
      return;
}
  public static void main(String [] arg){
    
    Scanner scan=new Scanner(System.in);
    
    int a,b,c;
    System.out.println("Enter three ints");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan); 
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
    
        
    }
}