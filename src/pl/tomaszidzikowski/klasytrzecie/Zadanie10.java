package pl.tomaszidzikowski.klasytrzecie;

import java.util.Scanner;
/*Napisz funkcję, która oblicza liczbę dzielników podanej liczby
 */
public class Zadanie10 {
    public static int countDividors(int number){
        int counter=0;
        for (int i = 2; i < number; i++) {
            if (number%i==0) counter++;
        }
        return counter+2;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=scanner.nextInt();
        System.out.println("Your number has "+countDividors(number)+" dividors");
    }
}
