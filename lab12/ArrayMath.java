///////////////////////////////////////////////////////////////////////
//Abi Rose
//lab12
//Array Math Java Program


public class ArrayMath{
  public static void main(String [] arg){
    double 
      x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
      v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   =  {4.6,16.0, 18.0,-2.1, 82.0, 23.0}");
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  
  public static boolean equals (double[] array1, double[] array2) {
    boolean b = true;
    for (int i = 0; i < array2.length; i++) {
        for (int j = 0; j < array1.length; j++) {
            if (array2[i] == array1[j]) {
                b = true;
                } 
                else {
                b = false;
                break;
            }
        }
    }
    return b;
  }
  
 public static double[] addArrays (double[] array1, double[] array2) {
  double[] c = new double[array1.length];
  for (int i = 0; i < array1.length; ++i) {
    c[i] = array1[i] + array2[i];
  
  }
  return c;
 }
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}
