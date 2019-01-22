import java.util.*;

class Matrixpotenz {
  static Scanner in = new Scanner(System.in);

  static double[][] matrixEinlesen () {
    System.out.println("Dimension");
    int n = in.nextInt();
    double[][] A = new double[n][n];
    for (int mu = 0; mu < A[0].length; mu++) {
      for (int nu = 0; nu < A.length; nu++) {
        A[mu][nu] = in.nextDouble();
      }
      System.out.println("\n");
    }
    return A;
  }

  static double[][] matrixMult (double[][] A, double[][] B) {
    double[][] C = new double[A.length][A.length];
    for (int mu = 0; mu < A.length; mu++) {
      for (int nu = 0; nu < A.length; nu++) {
        for (int i = 0; i < A.length; i++) {
          C[mu][nu] += A[mu][i] * B[i][nu];
        }
      }
    }
    return C;
  }

  static double[][] matrixPow (double[][] A, int e) {
    if (e == 0) {
      return new double[][]{ {1,0,0}, {0,1,0}, {0,0,1} };
    } else if (e%2 == 0) {
      return matrixPow( matrixMult(A,A), e/2);
    } else { //(e%2 != 0) {
      return matrixMult( A, matrixPow(A,e-1) );
    }
  }

  public static void main (String[] args) {
    double[][] A = matrixEinlesen();
    System.out.println("Potenz");
    int e = in.nextInt();
    double[][] B = matrixPow( A, e);
    for (int mu = 0; mu < B.length; mu++) {
      System.out.println( Arrays.toString(B[mu]) );
    }
  }
}
