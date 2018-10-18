public class MaschinenGenauigkeit_int {
  public static void main(String[] args) {
    double x = 2.3;
    double y = 2.0;
    if( (int)(x) == (int)(y) ) {
      System.out.println("x == y");
      System.out.println("ist wahr (int)\n");
    } else {
      System.out.println("x == y");
      System.out.println("ist nicht wahr (int)\n");
    }
  }
}
