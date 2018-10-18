import java.util.*;
public class Artikelverwaltung {
  static Scanner sc;

  static Artikel liesArtikel () {
    Artikel Ding = new Artikel();
    System.out.print( "Bitte Artikelname eingeben: " );
    Ding.bezeichnung = sc.next();
    System.out.print( "Bitte vorhandene Einheiten eingeben: " );
    Ding.anzahl = sc.nextInt();
    System.out.print( "Bitte Preis pro Einheit eingeben: " );
    Ding.preis = sc.nextDouble();
    return Ding;
  }

  /*Lese alle Artikel von der Konsole ein.*/
  static Artikel[] liesListe ( int AnzArtikel ) {
    Artikel[] Artikelliste = new Artikel[AnzArtikel];
    for ( int i = 0; i < AnzArtikel; ++i ) {
      Artikelliste[i] = liesArtikel();
    }
    return Artikelliste;
  }

  /*Gebe einen Artikel auf der Konsole aus.*/
  static void zeigeArtikel ( Artikel Ding ) {
    double Gesamtwert = Ding.anzahl * Ding.preis;
    System.out.printf( "%10.2f %10.2f %6s %20s \n",
                       Gesamtwert, Ding.preis, Ding.anzahl, Ding.bezeichnung );
  }

  /*Gebe eine Artikelliste auf der Konsole aus.*/
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

  /*Hauptprogramm.*/
  public static void main ( String[] args ) {
    Locale.setDefault( Locale.US );
    sc = new Scanner( System.in );

    System.out.print( "Bitte Anzahl der verschiedenen Artikel eingeben: " );
    int AnzArtikel = sc.nextInt();

    /*Lese alle Artikel von der Konsole ein.*/
    Artikel[] Artikelliste = liesListe( AnzArtikel );

    /*Gebe alle Artikel auf der Konsole aus.*/
    zeigeListe( Artikelliste );
  }
}
