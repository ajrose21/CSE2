//////////////////////////////////////////////////////////////
//Abi Rose
//Find Duplicates Java Program

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }
  
  public static boolean exactlyOneDup(int y[]) {
      int z=0;
      for (int i=0; i<y.length; i++){
        for (int j=i+1; j<y.length; j++){
            if (y[j]==y[i]) {
            z++;   
            }
        }
        if (z==1) return true;
    }
    return false;
  }
  
  public static boolean hasDups(int x[]){
    for (int i=0; i<x.length; i++){
        for (int j=i+1; j<x.length; j++){
            if (x[j]==x[i]) return true;
        }
    }
    return false;
}

  
  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
}
