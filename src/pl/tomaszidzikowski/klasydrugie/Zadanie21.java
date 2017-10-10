package pl.tomaszidzikowski.klasydrugie;
/*
* Napisz program, który wyznaczy ilość wystąpień liczby k w podanym ciągu liczb.
 */
public class Zadanie21 {
    public static void main(String[] args) {
        int [] tablica={5,4,5,1,2,5,4,3,6,7,8};
        int k=5;
        int counter=0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i]==k) counter++;
        }
        System.out.println("Liczba "+k+" wystapiła "+counter+" razy");
    }
}
