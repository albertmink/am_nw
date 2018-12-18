/*Hauptprogramm*/
public static void main ( String[] args ) {
  Locale.setDefault( Locale.US );
  sc = new Scanner( System.in );

  System.out.print( "Bitte Anzahl der verschiedenen Artikel eingeben: " );
  int anzArtikel = sc.nextInt();

  /*Lese alle Artikel von der Konsole ein*/
  Artikel[] artikelliste = liesListe( anzArtikel );

  /*Gebe alle Artikel auf der Konsole aus*/
  zeigeListe( artikelliste );
}
