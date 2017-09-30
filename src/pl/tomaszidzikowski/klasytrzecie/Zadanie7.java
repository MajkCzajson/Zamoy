package pl.tomaszidzikowski.klasytrzecie;

import java.util.HashSet;

/* Jest dana tablica 10 liczb całkowitych.
* Sprawdź ile jest różnych reszt z dzielenia tych liczb przez 37.
*
*/
public class Zadanie7 {
    public static void main(String[] args) {
        int table[]={17,4,5,37,12,37,38,38,2,10};
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i = 0; i < table.length; i++) {
            hashSet.add(table[i]%37);
        }
        System.out.println(hashSet.size());
    }
}
