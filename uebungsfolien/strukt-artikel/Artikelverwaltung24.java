/*Gebe eine Artikelliste auf der Konsole aus*/
static void zeigeListe ( Artikel[] artikelliste ) {
  System.out.printf( "%10s %10s %6s %20s \n",
                     "Gesamtwert", "Preis", "Anzahl",
                     "Bezeichnung" );
  double gesamtwert = 0.0;
  for ( int i = 0; i < artikelliste.length; ++i ) {
    zeigeArtikel( artikelliste[i] );
    gesamtwert +=  artikelliste[i].anzahl
                  *artikelliste[i].preis;
  }
  System.out.printf( "----------\n%10.2f\n", gesamtwert );
}
