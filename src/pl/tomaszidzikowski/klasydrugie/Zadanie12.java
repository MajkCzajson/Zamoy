package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*
* Napisz program, który odczytuje dany wyraz z konsoli tak długo aż natrafi na
* poprawnie wprowadzone hasło.
 */
public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password="12345";
        String word;
        do{
            System.out.println("Enter password");
            word=scanner.nextLine();
            if (!word.equals(password)) System.out.println("Wrong password. Try again!");
        }
        while(!word.equals(password));
        System.out.println("ACCESS GRANTED.");
        System.out.println("HAVE FUN.");
    }
}
