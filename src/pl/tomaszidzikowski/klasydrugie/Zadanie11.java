package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*
Napisz program, który wypisuje co drugą literę podanego wyrazu.
 */
public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scanner.nextLine();
        for (int i = 0; i < word.length(); i=i+2) {
            System.out.println(word.charAt(i));
        }
    }
}
