/* Vektorrechnung */
/* Stefan Findeisen WS16/17 */
/* Vektorrechnung mit Methoden */

import java.util.*;

public class Vektorrechnung{
  public static double[] Einlesen (int n){
    Scanner sc = new Scanner(System.in);
    double[] x = new double[n];
    for (int i=0; i<n; i++) {
      x[i] = sc.nextDouble();
    }
    return x;
  }
  
  public static void Ausgeben (double[] x){
    for (int i=0; i<x.length; i++) {
      System.out.println(x[i]);
    } 
  }
  
  public static double[] Addition (double[] x, double[] y){
    double[] res = new double[x.length];
    for (int i=0; i<res.length; i++)
      res[i]=x[i]+y[i];
    return res;
  }
  
  public static double[] Multiplikation (double[] x, double[] y){
    double[] res = new double[x.length];
    for (int i=0; i<res.length; i++)
      res[i]=x[i]*y[i];
    return res;
  }
  
  public static double Skalarprodukt (double[] x, double[] y){
    double res = 0;
    for (int i=0; i<x.length; i++)
      res += x[i]*y[i];
    return res;
  }
  
  public static double[] SkalareMultiplikation (double skalar, double[] x){
    double[] res = new double[x.length];
    for (int i=0; i<res.length; i++)
      res[i]=skalar*x[i];
    return res;
  }
  
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    // Eingabe
    System.out.println("Bitte Dimension n eingeben: ");
    int n = sc.nextInt();
    
    System.out.println("Bitte Skalar l eingeben:");
    double skalar = sc.nextDouble();
    
    System.out.println("Bitte Vektorelemente von x eingeben:");
    double[] x = Einlesen(n);
    
    System.out.println("Bitte Vektorelemente von y eingeben:");
    double[] y = Einlesen(n);
    
    // Ausgabe
    System.out.println("Das Ergebnis der Operation x+y ist:");
    Ausgeben(Addition(x,y));
    
    System.out.println("Das Ergebnis der Operation x.*y ist:");
    Ausgeben(Multiplikation(x,y));
    
    System.out.println("Das Ergebnis der Operation l*y ist:");
    Ausgeben(SkalareMultiplikation(skalar,x));
    
    System.out.println("Das Skalarprodukt von x und y ist:");
    System.out.println(Skalarprodukt(x,y));
  }
}
