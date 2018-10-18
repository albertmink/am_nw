// Author: A. Mink, Nov.2017, multidimensional arrays
...
  public static double getMaxValue(double[][] A) {
    double max = 0;
    for ( int m = 0; m < A.length; m++ ) {
      for ( int n = 0; n < A[m].length; n++ ) {
        if ( A[m][n] > max ) {
          max = A[m][n];
        }
      }
    }
    return max;
  }
...
