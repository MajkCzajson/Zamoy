package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*
Napisz program, który sprawdza czy liczba jest podzielna przez 4.
 */
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=scanner.nextInt();
        if (number%4==0)
            System.out.println("The number is divisible by four");
        else System.out.println("The number is not divisible by four");
    }
}
