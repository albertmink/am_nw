/* Minimal example
   Author: Albert Mink, Sep 2019
*/

public class HelloWorldWDH {
  public static void main (String[] args)
  {
    double x = 9.1;
    int g;
    g = x; // Fehler Datentyp
    g = (int)x; // o.k., konvertiere zu int

    double thisIsPi = 3.14159;
    double this = 8.1; // Fehler Keyword
  }
}
