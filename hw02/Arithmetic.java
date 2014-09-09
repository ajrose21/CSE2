//////////////////////////////////////////////////////
//Abi Rose
//hw02
//Arithmetic Java Program
//
//  Program Should:
//      compute total cost including PA sales tax (6%) at WalMart
//
//  first compile the program
//      javac.Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic{
    
    //add main method
        public static void main(String[] args) {
            
        //defining variables
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glassess
        int nGlasses=6;
        //Cost per Glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //tax percent on purchase
        double taxPercent=.06;
        
        //total cost of socks
        double totalSockCost$=nSocks*sockCost$;
        //total cost of glasses
        double totalGlassCost$=nGlasses*glassCost$;
        //total cost of envelopes
        double totalEnvelopeCost$=(nEnvelopes*envelopeCost$);
        //total cost before tax
        double totalCost$=(totalGlassCost$+totalEnvelopeCost$+totalSockCost$);
        
    
        //create new variables to two decimal places
        
        int decimal1=(int) totalSockCost$*100;
        double finalSock$= decimal1/100.0;
        int decimal2=(int) totalGlassCost$*100;
        double finalGlass$=decimal2/100.00;
        int decimal3=(int) totalEnvelopeCost$*100;
        double finalEnvelope$=decimal3/100.0;
        int decimal4=(int) (totalCost$)*100;
        double finalValue$= decimal4/100.0;
        

        //Need to calculate:
            //total cost of each kind of item
            //sales tax for that total cost
            //total cost of purchases (before tax)
            //total tax cost
            //total actually paid for transaction (including tax)
            
        //Print the following calculations
        
        System.out.println("The socks cost $"+ (nSocks*sockCost$) + 
        " before tax and the sales tax for this item is about $"+ 
        (finalSock$*taxPercent));
        System.out.println("The drinking glasses cost $"+ (nGlasses*glassCost$)
        +" before tax and the sales tax for this item is about $"+ 
        (finalGlass$*taxPercent));
        System.out.println("The envelopes cost $"+ (nEnvelopes*envelopeCost$)
        +" before tax and the sales tax for this item is about $"+ 
        (finalEnvelope$*taxPercent));
        
        System.out.println("The total cost of the purchase before tax is $"+
        (totalSockCost$+totalEnvelopeCost$+totalGlassCost$));
        System.out.println("The total sales tax of the purchase is about $"+
        (finalValue$*taxPercent));
        System.out.println("The total actually paid for the purchase with tax is about $"+ 
        (finalValue$*taxPercent+finalValue$));

    
        //run the calculations; store the values
        
        
        };
}  