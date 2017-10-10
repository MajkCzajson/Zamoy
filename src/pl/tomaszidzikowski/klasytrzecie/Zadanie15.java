package pl.tomaszidzikowski.klasytrzecie;

import java.util.Scanner;
import java.util.Stack;

/*
* .Korzystając ze Stosu, napisz funkcję, która odczytuje daną liczbę
* i zwraca liczbę zapisaną w systemie dwójkowym.
 */
public class Zadanie15 {
    public static String intToBinary(int number){
        Stack<Integer> stack=new Stack<>();
        StringBuilder binarna=new StringBuilder("");
        while(number>0){
            stack.add(number%2);
            number=number/2;
        }
        while(!stack.isEmpty()){
            binarna.append(stack.pop());
        }
        return binarna.toString();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int liczba=scanner.nextInt();
        System.out.println("Jej wartośc binarna to "+intToBinary(liczba));
    }
}
