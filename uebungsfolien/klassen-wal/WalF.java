class WalF {
  public String latin;
  WalF() { latin = "Cetacea"; }
  void latinName() {
    System.out.println("I am a "+latin);
  };
}

class Zahnwal extends WalF {
  Zahnwal( ) { latin = "Odontoceti"; }
}

class Pottwal extends WalF {
  Pottwal() { latin = "Physeter macrocephalus"; }
  void foo() {System.out.println("#theRealPottwal");}
}

class Bartenwal extends WalF {
  Bartenwal() { latin = "Mysticeti"; }
}
