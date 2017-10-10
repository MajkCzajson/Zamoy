package pl.tomaszidzikowski.klasydrugie;

public class Zadanie25 {
    public static void main(String[] args) {
        int firstNumber=5;
        int secondNumber=0;
        try{
            System.out.println(firstNumber/secondNumber);
        }
        catch (ArithmeticException e){
            System.out.println("Nie dziel przez zero!");
        }
        finally {
            System.out.println("Koniec programu");
        }

    }
}
