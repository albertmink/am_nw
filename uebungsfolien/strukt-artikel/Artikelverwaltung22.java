/*Lese alle Artikel von der Konsole ein*/
static Artikel[] liesListe ( int anzArtikel ) {
  Artikel[] artikelliste = new Artikel[anzArtikel];
  for ( int i = 0; i < anzArtikel; ++i ) {
    artikelliste[i] = liesArtikel();
  }
  return artikelliste;
}
