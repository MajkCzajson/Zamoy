package pl.tomaszidzikowski.klasytrzecie;

import java.util.Scanner;
import java.util.regex.Pattern;

/*Napisz program, który sprawdza czy podany wyraz jest poprawnym kodem pocztowym
 */
public class Zadanie3 {
    public static boolean isValidPostalCode(String word){
        return Pattern.matches("[0-9]{2}-[0-9]{3}",word);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your postal code");
        String word=scanner.nextLine();
        if (isValidPostalCode(word)) System.out.println("This is valid postal code");
        else System.out.println("This is not valid postal code");
    }
}
