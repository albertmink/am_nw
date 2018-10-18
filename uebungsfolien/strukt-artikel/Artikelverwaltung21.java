/*Lese einen Artikel von der Konsole ein*/
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
