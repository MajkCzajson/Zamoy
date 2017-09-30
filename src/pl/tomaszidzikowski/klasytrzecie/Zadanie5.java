package pl.tomaszidzikowski.klasytrzecie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

/*W tablicy jednowymiarowej znajdź liczbę, która występuje najczęściej.
*
 */
public class Zadanie5 {
    public static void main(String[] args) {
        int table[]={17,4,5,3,2,2,2,5,2};
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        for (int i = 0; i < table.length; i++) {
            if (treeMap.containsKey(table[i]))
                treeMap.put(table[i],treeMap.get(table[i])+1);
                    else treeMap.put(table[i],1);
        }
        System.out.println(treeMap.firstEntry());
    }
}
