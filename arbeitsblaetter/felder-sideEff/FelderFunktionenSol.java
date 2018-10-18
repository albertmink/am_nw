// Author: A. Mink, Nov.2017, side effects
public class FelderFunktionenSol{
  static int computeNorm(int n) {
    return n*n;
  }
  static double computeNorm(int[] x) {
    return x[0]*x[0] + x[1]*x[1];   // fix side effect
  }
  public static void main (String [] args){
    int a = 2;
    System.out.println(computeNorm(a));
    System.out.println(a);

    int[] d = {-1, 1};
    System.out.println(computeNorm(d));
    System.out.println(d[0]);
  }
}
