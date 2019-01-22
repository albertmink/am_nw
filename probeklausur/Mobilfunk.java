class Mobilfunk {
  public static void main (String[] args) {
    Betreiber fminus = new Betreiber(3);
    fminus.tn[1].sendeNachricht(2, fminus);
    fminus.tn[2].sendeNachricht(0, fminus);

    fminus.bericht();
  }
}
