/*Lese alle Artikel von der Konsole ein*/
static Artikel[] liesListe ( int AnzArtikel ) {
  Artikel[] Artikelliste = new Artikel[AnzArtikel];
  for ( int i = 0; i < AnzArtikel; ++i ) {
    Artikelliste[i] = liesArtikel();
  }
  return Artikelliste;
}
