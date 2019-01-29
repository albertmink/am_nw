import java.util.Scanner;

class Teilnehmer {
  public int nummer;
  private String name;
  private String speicher;
  private Betreiber bt;
  private Scanner in;

  Teilnehmer (int nummer_, Betreiber bt_) {
    nummer = nummer_;
    bt = bt_;
    System.out.println("Name ");
    in = new Scanner(System.in);
    name = in.next();
    speicher = "keine Nachricht";
  }

  public void sendeNachricht(int empfaengerNr, Betreiber empfaengerBt) {
    System.out.println("\nTeilnehmer " + name);
    System.out.println("sendet an " + empfaengerBt.tn[empfaengerNr].name);
    System.out.println("folgende Nachricht:");
    empfaengerBt.tn[empfaengerNr].speicher = in.next();
  }

  public String toString() {
    return name + " " + nummer + " " + speicher;
  }
}
