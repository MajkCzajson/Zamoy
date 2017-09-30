package pl.tomaszidzikowski.klasytrzecie;

import java.util.HashMap;

/* Sprawdź czy w tablicy jakaś liczba występuje co najmniej trzykrotnie.
*
 */
public class Zadanie6 {
    public static void main(String[] args) {
        int table[]={17,4,5,3,12,2,2,5,2};
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < table.length; i++) {
            if (hashMap.containsKey(table[i]))
                hashMap.put(table[i],hashMap.get(table[i])+1);
            else hashMap.put(table[i],1);
        }
        boolean isTriple=false;
        for (Integer key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            if (value>=3) {
                isTriple=true;
                break;
            }
        }
        if (isTriple) System.out.println("TAK");
        else System.out.println("NIE");
    }
}
