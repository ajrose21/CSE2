/////////////////////////////////////////////////////////////
//Abi Rose
//hw10
//PokerOdds Java Program

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  public static void showHands(){
      
      int hearts=0,spades=0,clubs=0,diamonds=0;
      Scanner scan=new Scanner(System.in);
      String[] hand= {"A", "K","Q", "J", "10", "9","8","7","6","5", "4","3", "2"};
      int [] card= new int [10];
      String answer="";
      do{
      int cardDealtH=0;
      int cardDealtD=0;
      int cardDealtC=0;
      int cardDealtS=0;
      for (int i=0;i<5;i++) { 
      card[i]=(int) Math.floor(Math.random()*52)+1;
     
      if (card[i]/13==0) {
          cardDealtH=card[i]%13;
          hearts++;
      }
      if (card[i]/13==1) {
          cardDealtD=card[i]%13;
          diamonds++;
      }
      if (card[i]/13==2) {
          cardDealtS=card[i]%13;
          spades++;
      }  
      if (card[i]/13==3) {
          cardDealtC=card[i]%13;
          clubs++;
      }
      }
     System.out.println("Hearts: " +hand[cardDealtH]);
     System.out.println("Diamonds: " + hand[cardDealtD]);
     System.out.println("Clubs: " +hand[cardDealtC]);
     System.out.println("Spades: " +hand[cardDealtS]);
      
     System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    
    }while(answer.equals("Y") || answer.equals("y"));
  }
    
    public static void simulateOdds(){
    String[] rank= {"A", "K","Q", "J", "10", "9","8","7","6","5", "4","3", "2"};
    int [] freq= new int [13];
    int [] cards= new int [10];
    for (int i=0; i<1000; i++) {
        for (int j=0;j<5;j++) { 
        cards[j]=(int) Math.floor(Math.random()*52)+1;
        }
        
        //can't figure out how to keep track of frequency
      /*  if (exactlyOneDup(cards)) {
            freq[i]=i;
        }
        else {
            freq[i]=freq[i];
       }
       */ }
        System.out.println("rank "+" freq of exactly one pair");
        for (int k=0; k<rank.length; k++) {
        System.out.println(rank[k]+"            "+freq[k]);
        }
        
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
}   

