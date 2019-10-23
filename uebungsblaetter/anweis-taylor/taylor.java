/* Taylorreihe
 * Author: Albert Mink, May 2018
*/
import java.util.*;

public class taylor {
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Eingabe Wert x ");
    double x = sc.nextDouble();
    System.out.println("Eingabe Wert N ");
    int N = sc.nextInt();
    double sum = 0;
    double yk = -1;
    for ( int k = 1; k <= N; k++ ) {
      yk = - x * yk;
      sum += yk / (double)k;
    }
    System.out.println("log("+x+"+1) : " + sum);
    System.out.println("Absoluter Fehler: " + Math.abs(sum-Math.log(x+1)));
  }
}
