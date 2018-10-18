// Author: A. Mink, Berechne Fakultaet
public class RekursionFak {
  static int fakultaet(int n) {
    System.out.println("fak");
    if (n <= 1) {
      return 1;
    } else {
      return n * (fakultaet(n-1));
    }
  }
  public static void main( String[] args) {
    int fak4 = fakultaet(4);
    System.out.println(fak4);
  }
}
