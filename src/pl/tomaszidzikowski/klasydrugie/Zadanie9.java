package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*
Napisz program, który odczytuje napis i wypisuje go wspak.
 */
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scanner.nextLine();
        String reverseWord=new StringBuilder(word).reverse().toString();
        System.out.println("The reverse word is "+reverseWord);
    }
}
