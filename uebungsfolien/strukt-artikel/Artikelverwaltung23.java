/*Gebe einen Artikel auf der Konsole aus*/
static void zeigeArtikel ( Artikel ding ) {
  double gesamtwert = ding.anzahl * ding.preis;
  System.out.printf( "%10.2f %10.2f %6s %20s \n",
                     gesamtwert, ding.preis, ding.anzahl,
                     ding.bezeichnung );
}
