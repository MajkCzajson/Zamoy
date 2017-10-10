package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*
* Napisz metodę, którą wczytuje n liczb do tablicy, a następnie wypisuje je w odwrotnej kolejności.
 */
public class Zadanie19 {
    public static void metoda(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę elementów");
        int liczba=scanner.nextInt();
        int [] tablica=new int[liczba];
        for (int i = 0; i < liczba; i++) {
            System.out.println("Podaj element nr "+i+"/"+liczba);
            tablica[i]=scanner.nextInt();
        }
        for (int i = liczba-1; i >=0; i--) {
            System.out.println("Element nr "+i+" : "+tablica[i]);
        }
    }

    public static void main(String[] args) {
        metoda();
    }
}
