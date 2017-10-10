package pl.tomaszidzikowski.klasytrzecie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Napisz program, w którym będzie zadeklarowana lista elementów typu String, następnie
napisz metodę, która będzie zliczać liczbę wystąpień poszczególnych elementów.
 */
public class Zadanie17 {
    public static Map<String,Integer> countElements(List<String> lista){
        Map<String,Integer> temp=new HashMap<String,Integer>();
        for (int i = 0; i < lista.size(); i++) {
            if (temp.containsKey(lista.get(i))) temp.put(lista.get(i),temp.get(lista.get(i))+1);
            else temp.put(lista.get(i),1);
        }
        return temp;
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("mysz");
        list.add("świnka");
        list.add("mysz");
        list.add("chomik");
        list.add("pies");
        list.add("mysz");
        System.out.println(countElements(list));
    }
}
