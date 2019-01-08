class Wal {
  public String latin;
  Wal() { latin = "Cetacea"; }
  void latinName() {
    System.out.println("I am a "+latin);
  };
}

class Zahnwal extends Wal {
  Zahnwal( ) { latin = "Odontoceti"; }
}

class Pottwal extends Wal {
  Pottwal() { latin = "Physeter macrocephalus"; }
}

class Bartenwal extends Wal {
  Bartenwal() { latin = "Mysticeti"; }
}
