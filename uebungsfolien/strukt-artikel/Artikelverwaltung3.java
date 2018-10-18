/*Hauptprogramm*/
public static void main ( String[] args ) {
  Locale.setDefault( Locale.US );
  sc = new Scanner( System.in );

  System.out.print( "Bitte Anzahl der verschiedenen Artikel eingeben: " );
  int AnzArtikel = sc.nextInt();

  /*Lese alle Artikel von der Konsole ein*/
  Artikel[] Artikelliste = liesListe( AnzArtikel );

  /*Gebe alle Artikel auf der Konsole aus*/
  zeigeListe( Artikelliste );
}
