package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;
/*Napisz funkcję, która stwierdza czy liczba jest pierwsza
 */
public class Zadanie16 {
    public static boolean isPrime(int number){
        for (int i = 2; i <= Math.ceil(Math.sqrt(number)); i++) {
            if (number%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=scanner.nextInt();
        if (isPrime(number)) System.out.println("Your number is prime");
        else System.out.println("Your number is not prime");
    }
}
