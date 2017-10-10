package pl.tomaszidzikowski.klasydrugie;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
* Napisz program TOTOLOTEK, który losuj 6 liczb z przedziału <6,49> Dla chętnych: liczby nie mogą sie powtarzać.
 */
public class Zadanie23 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set=new TreeSet<Integer>();
        while(set.size()!=6){
            set.add(random.nextInt(49)+1);
        }
        System.out.println(set);
    }
}
