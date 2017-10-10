package pl.tomaszidzikowski.klasydrugie;
/*
* Dla tablicy liczb całkowitych znajdź jednocześnie minimum i maksimum tablicy
 */
public class Zadanie20 {
    public static void main(String[] args) {
        int[] tablica = {5, 3, 1, 3, 5, 6, 8, 10, 12, 18, 3, 5};
        int min = tablica[0];
        int max = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (min<tablica[i]) min = tablica[i];
            if (max>tablica[i]) max = tablica[i];
        }
        System.out.println("Najmniejszy element "+min);
        System.out.println("Największy element "+max);
    }
}

