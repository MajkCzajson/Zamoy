package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/* Napisz program, który odczytuje liczbę rzeczywistą i wyświetla wartość całkowitą
 * tej liczby.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter double data type");
        double number=scanner.nextDouble();
        System.out.println("The int value of "+number+" is "+(int)number);
    }
}
