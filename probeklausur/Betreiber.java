class Betreiber {
  public int anzahlTN;
  public Teilnehmer[] tn;

  Betreiber (int anzahlTN_) {
    anzahlTN = anzahlTN_;
    tn = new Teilnehmer[anzahlTN];
    for (int i = 0; i < anzahlTN; i++) {
      tn[i] = new Teilnehmer(i, this);
    }
  }

  public void bericht() {
    System.out.println("\nBetreiber besteht aus " + anzahlTN + " Teilnehmer/n");
    for (int i = 0; i < anzahlTN; i++) {
      System.out.println(tn[i]);
    }
  }
}
