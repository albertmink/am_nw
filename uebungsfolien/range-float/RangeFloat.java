import java.util.*;
/* Minimal example for precision of floats
   Author: Albert Mink, Oct 2018
*/

public class RangeFloat {
  public static void main (String[] args)
  {
    // float can not represent 0.1 exactly
    float f = 0.1f;
    System.out.format( "0.1f = %.11f\n", f);
    System.out.format( "0.1f+0.1f = %.11f\n", f+f);
    // float can represent 0.5 exactly
    float g = 0.5f;
    System.out.format( "0.5f = %.11f\n", g);
    System.out.format( "0.5f+0.5f = %.11f\n", g+g);
  }
}
