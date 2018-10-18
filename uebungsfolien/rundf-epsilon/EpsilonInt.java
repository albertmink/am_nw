/** Berechne Maschinengenauigkeit des Datentyps int */
public class EpsilonInt {
  public static void main( String[] args ) {
    double x = 1.0;
    while ( ( int )( 1 + x ) != 1 ) {
      x /= 2.0;
    }
    double eps = 2.0 * x;
    System.out.println( "Die int-Maschinengenauigkeit ist " + eps );
  }
}
