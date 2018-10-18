/*Gebe eine Artikelliste auf der Konsole aus*/
static void zeigeListe ( Artikel[] Artikelliste ) {
  System.out.printf( "%10s %10s %6s %20s \n",
                     "Gesamtwert", "Preis", "Anzahl", "Bezeichnung" );
  double Gesamtwert = 0.0;
  for ( int i = 0; i < Artikelliste.length; ++i ) {
    zeigeArtikel( Artikelliste[i] );
    Gesamtwert += Artikelliste[i].anzahl
                  * Artikelliste[i].preis;
  }
  System.out.printf( "----------\n%10.2f\n", Gesamtwert );
}
