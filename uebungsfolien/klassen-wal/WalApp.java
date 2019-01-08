public class WalApp {
  public static void main(String[] args) {
    Wal w = new Wal();
    w.latinName();
    Zahnwal z = new Zahnwal();
    z.latinName();
    Pottwal p = new Pottwal();
    p.latinName();
    Wal w1 = new Pottwal();
    w1.latinName();
    Bartenwal b = new Bartenwal();
    b.latinName();
    Bartenwal b2 = new Zahnwal(); //error
  }
}
