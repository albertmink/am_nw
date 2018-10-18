import java.util.*;

class binsearch {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] feld = {2, 4, 6, 8, 10, 12, 14};

        System.out.println("Bitte Wert eingeben : ");
        int wert=sc.nextInt();

        int min = 0;
        int max = feld.length-1;

        while (min!=max) {
            int mid = (min+max)/2;
            System.out.println(" feld("+mid+") = "+feld[mid]);

            if (wert < feld[mid]) {
                max = mid-1;
            }

            if (wert > feld[mid]) {
                min = mid+1;
            }

            if (wert == feld[mid]) {
                min = max = mid;
            }
        }

        if (wert != feld[min]) {
            System.out.println("Der Wert "+wert+" ist nicht in feld gespeichert ");
        } else {
            System.out.println("Der Wert "+wert+" ist in feld("+min+") gespeichert ");
        }
    }
}
