/* Author: Albert Mink, Sep 2019 */
import java.util.Scanner;
public class SchleifenFakt {
  public static void main (String[] args) {
    int fakultat = 1;
    Scanner input = new Scanner(System.in);
    System.out.println("Berechne Fakulaet von ");
    int n = input.nextInt();
    for( int i = n; i>0; i-- ) {
      fakultat *= i;
    }
    System.out.println(fakultat);
    input.close();
  }
}
