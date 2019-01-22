class Betreiber {
  public int anzahlTN;
  public Teilnehmer[] tn;

  Betreiber (int n) {
    anzahlTN = n;
    tn = new Teilnehmer[anzahlTN];
    for (int i = 0; i < anzahlTN; i++) {
      tn[i] = new Teilnehmer(i, this);
    }
  }

  public void bericht() {
    System.out.println("\nBetreiber besteht aus " + anzahlTN + " Teilnehmer");
    for (int i = 0; i < anzahlTN; i++) {
      System.out.println(tn[i]);
    }
  }
}