package pl.tomaszidzikowski.klasytrzecie;

import java.util.Scanner;

/* Napisz program, który sprawdza czy ciąg znaków jest palindromem.
*
 */
public class Zadanie1 {
    public static boolean isPalindrome(String word){
        return word.equals(new StringBuilder(word).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=scanner.nextLine();
        if (isPalindrome(word)) System.out.println("This is palindrome");
        else System.out.println("This is not palindrome");
    }
}
