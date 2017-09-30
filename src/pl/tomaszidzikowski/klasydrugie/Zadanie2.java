package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*Napisz program, który odczytuje dwie liczby całkowite i zamienia je miejscami.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber=scanner.nextInt();
        int temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;
        System.out.println("The numbers after swap are "+firstNumber+","+secondNumber);
    }
}
