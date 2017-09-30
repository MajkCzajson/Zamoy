package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*
Napisz program, który wczytuje wiek i sprawdza czy osoba jest pełnoletnia.
 */
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        if (age>=18)
            System.out.println("You are adult");
        else System.out.println("You are not adult so far");
    }
}
