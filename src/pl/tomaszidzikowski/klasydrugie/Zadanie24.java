package pl.tomaszidzikowski.klasydrugie;

import java.util.HashMap;
import java.util.Scanner;

/*
* Napisz program, który przy pomocy instrukcji switch obliczy liczbę samogłosek we wprowadzonych przez użytkowniak tekście.
Każda samogłoska ma być obliczona oddzielnie.
 */
public class Zadanie24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] tablica={0,0,0,0,0,0,0};
        String word=scanner.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            switch(word.charAt(i)){
                case 'a': tablica[0]++;break;
                case 'e': tablica[1]++;break;
                case 'i': tablica[2]++;break;
                case 'o': tablica[3]++;break;
                case 'u': tablica[4]++;break;
                case 'y': tablica[5]++;break;
            }
        }
        System.out.println("Samogłoska a wystąpiła "+tablica[0]+" razy");
        System.out.println("Samogłoska e wystąpiła "+tablica[1]+" razy");
        System.out.println("Samogłoska i wystąpiła "+tablica[2]+" razy");
        System.out.println("Samogłoska o wystąpiła "+tablica[3]+" razy");
        System.out.println("Samogłoska u wystąpiła "+tablica[4]+" razy");
        System.out.println("Samogłoska y wystąpiła "+tablica[5]+" razy");
    }
}
