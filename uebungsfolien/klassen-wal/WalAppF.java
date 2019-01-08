public class WalAppF {
  public static void main(String[] args) {
    WalF f = new WalF();
    Pottwal p = new Pottwal();
    p.latinName();
    p.foo();
    WalF w1 = new Pottwal();
    w1.latinName();
    w1.foo(); //error
  }
}

