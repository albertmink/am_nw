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

  public void sendeNachricht(int nummer_, Betreiber bt_) {
    System.out.println("\nSendernummer " + name);
    System.out.println("Empfaengernummer " + bt_.tn[nummer_].name);
    System.out.println("Nachricht:");
    bt_.tn[nummer_].speicher = in.next();
  }

  public String toString() {
    return name + " " + nummer + " " + speicher;
  }
}