/* Author: Albert Mink, Sep 2019 */
import java.lang.Math.*;
public class SchleifenZeta {
  public static void main (String[] args) {
    int N = 190;
    System.out.println("Berechne bis zu N="+N);
    double sum = 0;
    for( int n = 1; n <= N; n++ ) {
      sum += 1./(n*n);
    }
    System.out.println("Ergebnis: "+sum);
    double absoluteFehler = Math.PI*Math.PI/6. - sum;
    absoluteFehler = Math.abs(absoluteFehler); // absolute Value
    System.out.println("Abweichung zum exakten Wert: "+absoluteFehler);
  }
}
