/** Diese Klasse repraesentiert eine komplexe Zahl. */
public class Komplex {

  /** real und imaginaer Teil. */
  private double real;
  private double imag;

  /** Konstruktor. */
  public Komplex( double real_, double imag_ ) {
    real = real_;
    imag = imag_;
  }

  /** toString-Methode. */
  public String toString() {
    return "" + real + " + i" + imag;
  }

  /** Betrag der komplexen Zahl. */
  public double betrag() {
    return Math.sqrt( real*real + imag*imag );
  }

  /** Gibt die Summe zweier komplexer Zahlen zurueck. */
  public static Komplex addieren(Komplex z1, Komplex z2) {
    return new Komplex( z1.real + z2.real, z1.imag + z2.imag );
  }

  /** Gibt das Produkt zweier komplexer Zahlen zurueck. */
  public static Komplex multiplizieren( Komplex z1, Komplex z2 ) {
    double x1 = z1.real;
    double x2 = z2.real;
    double y1 = z1.imag;
    double y2 = z2.imag;
    return new Komplex( x1 * x2 - y1 * y2, x1 * y2 - x2 * y1 );
  }
}
