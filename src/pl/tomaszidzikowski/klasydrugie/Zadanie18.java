package pl.tomaszidzikowski.klasydrugie;

import java.util.Scanner;

/*
Napisz metodę, która odczytuje a i n i zwraca a do potęgi n.
 */
public class Zadanie18 {
    public static double power(double a,double n){
        double result=1;
        for (int i = 1; i <=n; i++) {
            result=result*a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("We are about to calculate a^n. Enter your a number");
        double a=scanner.nextDouble();
        System.out.println("We are about to calculate a^n. Enter your n number");
        double n=scanner.nextDouble();
        System.out.println("The result is "+power(a,n));
    }
}
