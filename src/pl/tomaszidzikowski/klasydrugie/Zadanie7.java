package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*
Napisz program, który oblicza silnię.
 */
public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        long number=scanner.nextLong();
        long result=1;
        for (int i = 1; i <=number; i++) {
            result=result*i;
        }
        System.out.println("The factorial of "+number+" is "+result);
    }
}
