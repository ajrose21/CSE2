/////////////////////////////////////////////////////////////////
//Abi Rose
//hw11
//Matrix Sorter java program
//program should:
//

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
  //  sort(mat3d[2]);
    show(mat3d);
   }
   public static int findMin(int z [][][]) {
    int min=100;
    for (int i=0; i<z.length; i++) {
       for (int j=0; j<z[i].length; j++) {
         for (int k=0; k<z[i][j].length; k++) {
            if (z[i][j][k] < min) {
                min =z[i][j][k];
            }
         }
       }
    }
    return min;
    }
   public static int [][][] buildMat3d() {
   int [][][]x= {{{27},{68,45},{76,13,4}}, 
   { {32,11}, {20,81,68}, {34,74,18,46},
   {79, 20, 22, 11, 9}, {91, 30, 55, 21, 28, 40} },
   {{33, 54, 74}, {54, 59, 65, 47}, {42, 41, 98, 31,  5},
   {13, 90, 6,  1, 29,  3}, {39, 40, 58, 62, 33, 23, 14}, 
   {32,  4, 12, 72, 11, 27, 95, 78} ,{39, 16, 84, 66, 20,  9, 34,  2, 62} }};
   
   return x;
   }
   public static void show(int x[][][]) {
     for (int i=0; i<x.length; i++) {
       for (int j=0; j<x[i].length; j++) {
         for (int k=0; k<x[i][j].length; k++) {
           System.out.print(x[i][j][k]+" ");
         }
       System.out.println();
       }
       System.out.println("-------------------------Slab"+(i+1));
       
     }
   }
  /* public static int [][] sort(int x[][]) {
          for ( int i = x.length - 1; i > 0; i -- )  {
          int first = 0;
          int [] temp= new int [x.length];
          for(int j = 1; j <= i; j++) {
               if(x[j] < x[first] ) {        
                 first = j;
          }
          temp = x[first];  
          x[first] = x[i];
          x[i] = temp; 
      }
          }
      sort2(x);
return x;   
   }
   public static int [][] sort2(int y[][]) {
       int n=0;
       for (int m = 1; m < y.length; m++) {
           int [] key = y[m];
           for( n = m- 1; (n >= 0) && (y[n] < key); n--) {
                 y[n+1] = y[n];
          }
         y[n+1] = key;   
     }
    return y;
   }
   //keep getting "error:bad operand types for binary operator '<'"
   
  */  
    
}
