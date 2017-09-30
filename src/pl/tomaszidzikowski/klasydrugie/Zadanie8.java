package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*
Napisz program, który odczytuję ciąg znaków i wypisuje ostatnią literę.
 */
public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scanner.nextLine();
        System.out.println("The last letter is "+word.charAt(word.length()-1));
    }
}
