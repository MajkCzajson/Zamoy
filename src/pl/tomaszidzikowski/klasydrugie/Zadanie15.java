package pl.tomaszidzikowski.klasydrugie;
/*
Napisz funkcję, która wyznacza sumę cyfr zadanej liczby całkowitej.
 */
public class Zadanie15 {
    public static int sum(int number){
        String stringNumber=String.valueOf(number);
        int sum=0;
        for (int i = 0; i < stringNumber.length(); i++) {
            sum=sum+Integer.valueOf(stringNumber.charAt(i)+"");
        }
        return sum;
    }
    public static void main(String[] args) {
        int number=12345;
        System.out.println(sum(number));
    }
}
