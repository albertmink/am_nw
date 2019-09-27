public class Felderb1 {
  public static void main (String[] args) {  
    int[] a = new  int[] {1,3,4,2,3};
    int  e = a[0];
    for( int i = 1; i < a.length; i++ ) {
      if( a[i] > e ) {
        e = a[i];
	System.out.println(e);
      }
    }
    System.out.println("Fertig mit " + e + ".");
  }
}