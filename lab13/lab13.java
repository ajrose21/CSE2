///////////////////////////////////////////////////////////////////////
//Abi Rose

//lab11

//Array Math Java Program




public class lab13{
  
  public static void main(String [] arg){


        int[][] myA = { {25, 12, 26, 17, 23}, {20,  3, 16, 21, 28, 33, 28, 19},
            {24, 13, 22, 30, 31, 2, 11, 22, 26, 26, 30}, {0,  7,  4, 36, 38, 31, 39,  2, 35, 33, 27, 28, 13, 38},
            {31, 39, 2, 7, 22, 10, 35, 32, 38, 30, 13, 26, 37, 10, 20, 23, 12} };



        for (int i = 0; i < myA.length; i++) {
            for (int j = 0; j < myA[i].length; j++) {
                System.out.print(myA[i][j] + " ");
            }
            System.out.println();
        }
        sort (myA);
        
    }
    
    
    
    public static void sort(int [][] x) {
    int temp [][]= new int [10][10];
    for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                    x[i][j]= x[i][j];
            }
    }
    /* for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < x[i].length; j++) {
                if (x[i][j]<temp[i][j-1]) {
                    x[i][j]=temp[i][j-1];
                }
                
    }
     }
    for (int m = 0; m < x.length; m++) {
            for (int k = 0; k < x.length; k++) {
                System.out.print(temp[m][k] + " ");
            }
            System.out.println();
       }*/
int[][] B = { {12, 17, 23, 25, 26}, {3, 16,19, 20, 21, 28, 28, 33},
{2, 11, 13, 22, 22, 24, 26, 26, 30, 30, 31}, { 0,  2,  4,  7, 13, 27, 28, 31, 33, 35, 36, 38, 38, 39},
{ 2,  7, 10, 10, 12, 13, 20, 22, 23, 26, 30, 31, 32, 35, 37, 38, 39}};


        for (int p = 0; p < B.length; p++) {
            for (int q = 0; q < B[p].length; q++) {
                System.out.print(B[p][q] + " ");
            }
            System.out.println();
        }
        
    }
}