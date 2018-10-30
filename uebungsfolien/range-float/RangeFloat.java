import java.util.*;
/* Minimal example for precision of floats
   Author: Albert Mink, Oct 2018
*/
public class RangeFloat {
  public static void main (String[] args)
  {
    float f = 1.0000001f;
    float g = 0.00000001f;
    System.out.format( "1.0000001f  = %.11f\n", f);
    System.out.format( "0.00000001f = %.11f\n", g);
    System.out.format( "1.0000001f+0.00000001f = %.11f\n", f+g);
    System.out.format( "1.0000001f+...+1.0000001f = %.11f\n", f*10);
    // float can represent 0.5 exactly
    float h = 0.5f;
    System.out.format( "0.5f = %.11f\n", h);
    System.out.format( "0.5f+0.5f = %.11f\n", h+h);
  }
}
