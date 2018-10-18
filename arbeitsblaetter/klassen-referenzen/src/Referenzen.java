import java.util.*;

class MeineKlasse {
  public int zahl;
}

public class Referenzen{
  static MeineKlasse ErhoeheKlasse(MeineKlasse Klasse) {
    MeineKlasse HilfsKlasse = new MeineKlasse();
    HilfsKlasse.zahl = Klasse.zahl + 1;
    return HilfsKlasse;
  }
  
  static MeineKlasse ErhoeheKlassenEintrag(MeineKlasse Klasse) {
    Klasse.zahl = Klasse.zahl + 1;
    return Klasse;
  }
    
  static int[] ErhoeheFeld(int[] feld) {
    int[] hilfsFeld = new int[1];
    hilfsFeld[0] = feld[0] + 1;
    return hilfsFeld;
  }
  
  static int[] ErhoeheFeldEintrag(int[] feld) {
    feld[0] = feld[0] + 1;
    return feld;
  }
    
  static int ErhoeheZahl(int zahl) {
    int hilfsZahl;
    hilfsZahl = zahl + 1;
    return hilfsZahl;
  }
    
  static int ErhoeheZahlEintrag(int zahl) {
    zahl = zahl + 1;
    return zahl;
  }
  
  public static void main(String[] args) {
    /*** Uebergabe durch Kopie ***/ 
    /*** Grunddatentypen: ***/ 
    int zahl_a = 0;
    int zahl_b = 0;
    
    zahl_b = ErhoeheZahl(zahl_a); // aendert nur Kopie
    System.out.println(zahl_a + " : " + zahl_b);
    zahl_b = ErhoeheZahlEintrag(zahl_a); // aendert nur Kopie
    System.out.println(zahl_a + " : " + zahl_b);
    
    /*** Uebergabe durch Referenzen ***/
    /*** Felder: ***/
    int[] feld_a = new int[1];
    int[] feld_b;
    feld_a[0]=0;
    
    feld_b = ErhoeheFeld(feld_a); // aendert nur Referenz
    System.out.println(feld_a[0] + " : " + feld_b[0]);	
    feld_b = ErhoeheFeldEintrag(feld_a); // aendert Eintrag
    System.out.println(feld_a[0] + " : " + feld_b[0]);	
    
    /*** Klassen: ***/
    MeineKlasse Klasse_a = new MeineKlasse();
    MeineKlasse Klasse_b;
    Klasse_a.zahl = 0;
    
    Klasse_b = ErhoeheKlasse(Klasse_a); // aendert nur Referenz
    System.out.println(Klasse_a.zahl + " : " + Klasse_b.zahl);
    Klasse_b = ErhoeheKlassenEintrag(Klasse_a); // aendert Eintrag
    System.out.println(Klasse_a.zahl + " : " + Klasse_b.zahl);
  }
}
