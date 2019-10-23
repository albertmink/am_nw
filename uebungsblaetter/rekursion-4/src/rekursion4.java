import java.util.*;

class rekursion4 {
  static int f1(int x, int y)
  {
     if (y <= 0) return 1;
     if (y % 2 == 0)
        return f1(x*x, y/2);
     else
        return x*f1(x, y-1);
  }
  static int f2(int x, int y)
  {
     if (y <= 0) return 1;
     int result = 1;
     while(y>=1){
       if(y % 2 == 0){
          x *= x;
          y /= 2;
       }
       else{
          result *= x;
          y--;
       }
     }  
     return result;
  }
  public static void main(String[] args) {
     System.out.println(f1(3, 4));
     System.out.println(f2(3, 4));
  }
}
