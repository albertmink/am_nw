public class MaschinenGenauigkeit {
  public static void main(String[] args) {
    double x = 1.0;
    while ( 1.0 + x != 1.0 ) {
      x = x / 2.0;
    }
    double eps = 2.0 * x;
    System.out.println("Die double-Maschinengenauigkeit ist " + eps);
  }
}
