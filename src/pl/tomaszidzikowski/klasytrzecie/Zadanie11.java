package pl.tomaszidzikowski.klasytrzecie;

import java.util.HashMap;
import java.util.Scanner;

/*Znajdz liczbę z przedziału 2 do 10000, która ma największą liczbę dzielników
 */
public class Zadanie11 {
    public static HashMap<Integer,Integer> hashMap=new HashMap<>();

    public static int countDividors(int left,int right){
        int counter;
        int max=0;
        int maxElement=0;
        for (int i = left; i <=right; i++) {
            counter=2;
            for (int j = 2; j <i; j++) {
                if (i%j==0) counter++;
            }
            if(counter>max) {
                max=counter;
                maxElement=i;
            }
            hashMap.put(i,counter);
        }
        return maxElement;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int element=countDividors(2,10000);
        System.out.println("The number " +element+" has "+hashMap.get(element)+" dividors.");
    }
}
