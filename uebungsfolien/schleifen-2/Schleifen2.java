/* Author: Albert Mink, 03.Nov 2017 */
public class Schleifen2 {
  public static void main (String[] args) {
    int k = 0;
    while (k < 8) {
      if (k % 4 == 0) {
        System.out.print("+");
      } else {
        System.out.print("//");
      }
      k = k + 2;
    }
  }
}
