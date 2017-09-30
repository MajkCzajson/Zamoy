package pl.tomaszidzikowski.klasytrzecie;

import java.util.Scanner;

/*Napisz program, który oblicza liczbę małych liter w podanym wyrazie.
*
 */
public class Zadanie4 {
    public static int countLowerCaseLetters(String word){
        int counter=0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scanner.nextLine();
        System.out.println("You entered a word with "+countLowerCaseLetters(word)+" lowercase letters");
    }
}
