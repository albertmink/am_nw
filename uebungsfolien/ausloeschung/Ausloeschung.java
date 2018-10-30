import java.util.*;
/* Minimal example for precision of floats
   Author: Albert Mink, Oct 2018
*/

public class Ausloeschung {
  public static void main (String[] args)
  {
    // precision of float 10^-7
    float f = 1.0000011f;
    float g = 1.0000010f;
    System.out.format( "f = %.8f\n", f);
    System.out.format( "g = %.8f\n", g);
    System.out.format( "f - g = %.8f\n", f-g);
  }
}

