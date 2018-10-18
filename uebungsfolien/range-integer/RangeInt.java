import java.util.*;
/* Minimal example for range of int
   Author: Albert Mink, Oct 2018
*/

public class RangeInt {
  public static void main (String[] args)
  {
    int i = 0;
    for( ;  i<2147483647; i++)
    {
      i += i;
    }
    System.out.println( i );
    i = i+1;
    System.out.println( i );

  }
}
