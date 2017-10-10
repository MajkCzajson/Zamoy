package pl.tomaszidzikowski.klasytrzecie;

import java.util.ArrayList;
import java.util.List;

/*
* Napisz program, w którym będzie zadeklarowana lista elementów typu String, następnie
 *napisz metodę która będzie sprawdzać czy występują w niej powtarzające się elementy.
 */
public class Zadanie16 {
    public static boolean isRepeatable(List<String> lista){
        int i=0;
        while(!lista.isEmpty()){
            String element=lista.get(i);
            lista.remove(i);
            if (lista.contains(element)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("mysz");
        list.add("świnka");
        list.add("mysz");
        list.add("chomik");
        list.add("pies");
        list.add("mysz");
        if (isRepeatable(list)) System.out.println("Są elementy powtarzające się!");
        else System.out.println("Nie ma elementów powtarzających się");
    }
}
