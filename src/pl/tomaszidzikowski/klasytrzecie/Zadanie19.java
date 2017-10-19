package pl.tomaszidzikowski.klasytrzecie;
/*
* Napisz program, który posortuje zdefiniową tablicę. Użyj klasy TreeSet
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Zadanie19 {
    public static void main(String[] args) {
        int [] tab={4,14,5,0,1,13};
        Set<Integer> set=new TreeSet<>();
        for (int i : tab) {
            set.add(i);
        }
        System.out.println(set);

    }
}
