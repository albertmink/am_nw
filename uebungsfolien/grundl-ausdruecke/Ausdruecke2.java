// author: Albert Mink
// date: sept 2017
// grundl-ausdruecke
public class Ausdruecke2 {
  public static void main (String[] args) {
    System.out.println( "---------boolean----------" );
    System.out.println( "11: 1 > 2 = "+(1>2) );
    System.out.println( "14: 1 == 2 = "+(1==2) );
    System.out.println( "15: (1+1)>1 = "+((1+1)>1 ) );
    System.out.println( "---------modulo-----------" );
    System.out.println( "10: 15 %% 2 = "+(15 % 2) );
    System.out.println( "5: 14.0%%5 = "+(14.0%5)+" (double)");
    System.out.println( "-----------ascii----------" );
    System.out.println( "12: 'a'+1 = "+('a'+1 ) + " // 98" );
    System.out.println( "(char)98 = "+((char)98)+" // b" );
    System.out.println( "'a'+'b' = "+('a'+'b')+" // 195" );
  }
}
