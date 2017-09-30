package pl.tomaszidzikowski.klasydrugie;
/*
Napisz metodę obliczającą sumę dwóch liczb całkowitych.
 */
public class Zadanie13 {
    public static int sum(int firstNumber,int secondNumber){
        return firstNumber+secondNumber;
    }
    public static void main(String[] args) {
        int firstNumber=10;
        int secondNumber=22;
        System.out.println("The sum is "+sum(firstNumber,secondNumber));
    }
}
