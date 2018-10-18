// compute integral via trapezoidal rule
import java.util.*;
public class Trapez{
  public static double f(double x) {
    return -x*x + 4;
  }
  public static void main(String[] args) {
    double a = 0;
    double b = 3;
    int N = 6;
    // (a)
    double I1;
    // (b)
    double I2;

    // check integral = 3
    System.out.println("a: " + I1);
    System.out.println("b: " + I2);
  }
}
