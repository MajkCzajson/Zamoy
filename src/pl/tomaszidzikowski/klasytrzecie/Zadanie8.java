package pl.tomaszidzikowski.klasytrzecie;
/*Napisz funkcję, która wyznacza sumę cyfr zadanej liczby całkowitej
*
 */
public class Zadanie8 {
    public static void main(String[] args) {
        int number=12345;
        String stringNumber=String.valueOf(number);
        int sum=0;
        for (int i = 0; i < stringNumber.length(); i++) {
            sum=sum+Integer.valueOf(stringNumber.charAt(i)+"");
        }
        System.out.println(sum);
    }
}
