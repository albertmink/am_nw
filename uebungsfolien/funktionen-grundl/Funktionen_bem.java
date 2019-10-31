/* Minimal example for call-by-value*/
import java.util.*;
public class Funktionen_bem {
  public static int returnOne(int a) {
    a = 42; // Variable a ist lokale Kopie, hier von i=3
    return 1;
  }
  public static void main(String[] args) {
    int i = 3;
    System.out.println(returnOne(i));
    System.out.println(i);
  }
}
