///////////////////////////////////////////////////////////////////////
//Abi Rose
//lab11
//Array Java Program

import java.util.Scanner; //importing scanner

public class Arrays{
  public static void main(String [] arg){
      int min=100;
      int max=0;
      int sum=0;
      Scanner myScanner;
      myScanner= new Scanner (System.in);
      int[] numbers = new int[10];
      int i=0;
      
      System.out.println("Please enter 10 numbers");      
      for (i = 0; i < numbers.length ; i++) {
        numbers[i] = myScanner.nextInt();
        sum+=i;
       if (numbers[i]>max) {
          max=numbers[i];
        }
        if (numbers[i]<min) {
          min=numbers[i];
        }
      }
    System.out.println("The max is: "+max);
    System.out.println("The min is: "+min);
    System.out.println("The sum is: "+sum);
    
  }
}


    
   
   