/* Author: Albert Mink, 03.Nov 2017 */
public class Schleifen2_for {
  public static void main (String[] args) {
    for ( int k = 0; k < 8; k += 2) {
      if (k % 4 == 0) {
        System.out.print("+");
      } else {
        System.out.print("//");
      }
    }
  }
}
