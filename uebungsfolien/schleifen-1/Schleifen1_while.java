/* Author: Albert Mink, 03.Nov 2017 */
public class Schleifen1_while {
  public static void main (String[] args) {
    int i = 0;
    int n = 0;
    while ( i < 7 ) {
      if (i == 4) {
        i = i + 1;
        n = n + i;
      } else {
        n = n + i;
      }
      i = i + 1;
    }
    System.out.println("Ergebnis " + n);
  }
}
