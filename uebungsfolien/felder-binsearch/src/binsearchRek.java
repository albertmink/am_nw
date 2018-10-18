import java.util.*;

class binsearchRek {
    static int binSearch(int[] feld, int wert, int min, int max)
    {
        int mid = (min+max)/2;

        if (max <= min) {
            return mid;
        } else {
            if (wert < feld[mid]) {
                return binSearch(feld, wert, min, mid-1);
            } else {
                return binSearch(feld, wert, mid+1, max);
            }
        }
    }
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] feld = {2, 4, 6, 8, 10, 12, 14};

        System.out.println("Bitte Wert eingeben : ");
        int wert=sc.nextInt();

        int min = 0;
        int max = feld.length-1;

//     while(min!=max){
//       int mid = (min+max)/2;
//       System.out.println(" feld("+mid+") = "+feld[mid]);
//
//       if (wert < feld[mid])
//         max = mid-1;
//       if (wert > feld[mid])
//         min = mid+1;
//       if (wert == feld[mid])
//         min = max = mid;
//     }
        int erg = min;
        erg = binSearch(feld, wert, 0, feld.length-1);

        if (wert != feld[erg]) {
            System.out.println("Der Wert "+wert+" ist nicht in feld gespeichert ");
        } else {
            System.out.println("Der Wert "+wert+" ist in feld("+erg+") gespeichert ");
        }
    }
}
