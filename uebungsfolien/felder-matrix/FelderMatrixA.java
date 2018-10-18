// Author: A. Mink, Nov.2017, multidimensional arrays
import java.util.Arrays;
public class FelderMatrix{
  public static double[][] getIdentity() {
    // row major, [m][n] -> m-row and n-column
    return new double[][]{{1,0,0},{0,1,0},{0,0,1}};
  }
  public static double[] getTrace(double[][] A) {
    return new double[]{A[0][0],A[1][1],A[2][2]};
  }
  public static void printMatrix(double[][] A) {
    for ( int m = 0; m < A.length; m++ ) {
      System.out.println(Arrays.toString(A[m]));
    }
  }
...

}
