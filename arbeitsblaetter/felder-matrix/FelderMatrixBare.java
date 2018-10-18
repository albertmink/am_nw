// Author: A. Mink, Nov.2017, multidimensional arrays
import java.util.Arrays;
public class FelderMatrix{
  public static double[][] getIdentity() {  }
  public static double[] getTrace(double[][] A) {  }
  public static double getMaxValue(double[][] A) {  }
  public static double getSpaltensummennorm(double[][] A) {  }

  public static void printMatrix(double[][] A) {
    for ( int m = 0; m < A.length[]; m++ ) {
      System.out.println(Arrays.toString(A[m]));
    }
  }

  public static void main (String [] args){
    double[][] E = getIdentity();
    printMatrix(E);
    System.out.println("\nMax Value " + getMaxValue(E));
    System.out.println("Spur " +Arrays.toString(getTrace(E)));
    System.out.println("Spaltensummennorm " + getSpaltensummennorm(E));
  }
}
