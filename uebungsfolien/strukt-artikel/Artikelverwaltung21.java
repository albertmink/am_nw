/*Lese einen Artikel von der Konsole ein*/
static Artikel liesArtikel () {
  Artikel ding = new Artikel();
  System.out.print( "Bitte Artikelname eingeben: " );
  ding.bezeichnung = sc.next();
  System.out.print( "Bitte vorhandene Einheiten eingeben: " );
  ding.anzahl = sc.nextInt();
  System.out.print( "Bitte Preis pro Einheit eingeben: " );
  ding.preis = sc.nextDouble();
  return ding;
}
