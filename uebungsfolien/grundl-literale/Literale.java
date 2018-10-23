// author: Albert Mink
// date: sept 2017
// grundl-literale
public class Literale {
  public static void main (String[] args) {
    System.out.println("1: \"Hello!\" " + ("Hello!") );
    System.out.println("3: 1E6 "+(1E6)+" double" );
    System.out.println("9: 0341 "+(0341)+": 341_8 = 1*8^0 + 4*8 + 3*8^2 = 225_10 = 225" );
    System.out.println("13: 0xABC "+(0xABC)+": 0xABC_16 = 12*16^0 + 11*16^1 + 10*16^2 = 2748_10" );
    System.out.println("15: 0xCEL "+(0xCEL)+": 0xCEL_16 = 14*16^0 + 12*16^1 = 206_10" );
  }
}
