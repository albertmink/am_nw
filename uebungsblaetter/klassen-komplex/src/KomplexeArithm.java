import java.util.*;

public class KomplexeArithm {

  public static void main( String[] args ) {
    Locale.setDefault( Locale.US );
    Scanner sc = new Scanner( System.in );

    System.out.println( "Geben Sie den Real- und Imaginaerteile einer " +
                        "komplexen Zahl z ein:" );
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    Komplex z = new Komplex( x, y );

    System.out.println( "Geben Sie den Real- und Imaginaerteile einer " +
                        "komplexen Zahl w ein:" );
    x = sc.nextDouble();
    y = sc.nextDouble();
    Komplex w = new Komplex( x, y );

    System.out.println( "|z| = " + z.betrag() );
    System.out.println( "|w| = " + w.betrag() );
    System.out.println( "z + w = " + Komplex.addieren( z, w ) );
    System.out.println( "z * w = " + Komplex.multiplizieren( z, w ) );
  }
}
