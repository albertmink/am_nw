// Author: A. Mink, Berechne Fakultaet
public class RekursionFakLoop {
  static int fakultaet(int n) {
    int fak = 1;
    for ( int i = 1; i <= n; i++) {
      fak = fak*i;
    }
    return fak;
  }
  public static void main( String[] args) {
    int fak4 = fakultaet(4);
    System.out.println(fak4);
  }
}
