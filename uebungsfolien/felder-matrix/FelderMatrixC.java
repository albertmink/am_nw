// Author: A. Mink, Nov.2017, multidimensional arrays
...
  public static double getSpaltensummennorm(double[][] A) {
    double max = 0;
    for ( int n = 0; n < A[0].length; n++ ) {
      double[] spalte = new double[3];
      for ( int m = 0; m < A.length; m++ ) {
        spalte[m] = A[m][n];
      }
      double spaltenNorm = 0;
      for ( int i = 0; i < A.length; i++ ) {
        spaltenNorm += Math.abs(spalte[i]);
      }
      if (spaltenNorm>max) {
        max = spaltenNorm;
      }
    }
    return max;
  }
...
