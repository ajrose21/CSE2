/////////////////////////////////////////////////////////////////
//Abi Rose
//hw11
//Poker Hands java program
//program should:
//  ask user for 5 cards
//  display the cards chosen
//  determine whether it is a full house or not
//  ask if they'd like to play again

import java.util.Scanner;
public class PokerHands{
  public static void main(String [] arg){
      Scanner myScanner;
      myScanner = new Scanner( System.in);
      Scanner scan=new Scanner(System.in);
      String answer="";
      
      String [] suit=  new String [5];
      String [] cardC= new String [5];
      String [] cardD= new String [5];
      String [] cardH= new String [5];
      String [] cardS= new String [5];
      do {
      for (int i=0; i<5; i++) {
          System.out.println("Enter the suit: 'c', 'd', 'h', or 's'");
          suit[i]=myScanner.next();
          if (suit[i].equals("c") ||suit[i].equals("d") ||suit[i].equals("h") ||suit[i].equals("s")) {
              suit[i]=suit[i];
              }
          else {      
              System.out.println("You did not enter a valid response");
          }
          if (suit[i].equals("c")) {
          System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
          cardC[i]=myScanner.next();
          if(hasDups(cardC)==true) {
              System.out.println("you already entered that card");
          }
           }
          if (suit[i].equals("d")) {
          System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
          cardD[i]=myScanner.next();
          if (hasDups(cardD)){
              System.out.println("you already entered that card");
          }
              
          }
          if (suit[i].equals("h")) {
          System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
          cardH[i]=myScanner.next();
          if(hasDups(cardH)){
              System.out.println("you already entered that card");
          }
              
          }
          if (suit[i].equals("s")) {
          System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
          cardS[i]=myScanner.next();
          if(hasDups(cardS)){
              System.out.println("you already entered that card");
          }
              
          }
          
      }
      
      changeLength(cardS);
      changeLength(cardC);
      changeLength(cardH);
      changeLength(cardD);
     
     System.out.println("Clubs:"); 
     for (int j=0; j<cardC.length; j++) {
     System.out.print(cardC[j]);
     }
     System.out.println("");
     System.out.println("Diamonds:");
     for (int k=0; k<cardD.length; k++) {
     System.out.print(cardD[k]);
     }
     System.out.println("");
     System.out.println("Hearts:");
     for (int l=0; l<cardH.length; l++) {
     System.out.print(cardH[l]);
     }
     System.out.println("");
     System.out.println("Spades:");     
     for (int m=0; m<cardS.length; m++) {
     System.out.print(cardS[m]);
     }
    System.out.println("");
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    
    }while(answer.equals("Y") || answer.equals("y"));
      }
    public static boolean hasDups(String x[]){
    for (int i=0; i<x.length; i++){
        for (int j=i+1; j<x.length; j++){
            if (x[j]==x[i]) return true;
        }
    }
    return false;
}
      public static String [] changeLength(String [] a) {
       for(int i=0; i<a.length; i++) {
        if(a[i] == null) {
            fillArray(a, i);
        }
    }
    return a;
}

public static String [] fillArray(String [] a, int i) {
    String[] a2 = new String[a.length-1];
    for(int j=0; j<a2.length; j++) {
            if(j<i) {
                a2[j]=a[j];
            }
        else if(j>i) {
            a2[j]=a[j+1];
        }
    }

    a=a2;
    return a;
}
}
