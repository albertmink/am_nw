    int[] feld = {2, 4, 6, 8, 10, 12, 14};
    int wert = 9;
    int min = 0;
    int max = feld.length - 1;
    while (min != max) {
      int mid = (min+max) / 2;
      System.out.println(" feld("+mid+") = "+feld[mid]);
      if (wert < feld[mid]) { max = mid-1; }
      if (wert > feld[mid]) { min = mid+1; }
      if (wert == feld[mid]) { min = max = mid;}
    }
    if (wert != feld[min]) {
      System.out.println("...");
    } else {
      System.out.println("...");
    }
