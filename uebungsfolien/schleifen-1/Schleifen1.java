/* Author: Albert Mink, 03.Nov 2017 */
public class Schleifen1 {
  public static void main (String[] args) {
    int n = 0;
    for (int i=0; i < 7; i++) {
      if (i == 4) {
        i = i + 1;
        n = n + i;
      } else {
        n += i;  // equivalent to n = n + 1;
      }
//      System.out.println(i + "  --  " + n);
    }
    System.out.println("Ergebnis " + n);
  }
}
