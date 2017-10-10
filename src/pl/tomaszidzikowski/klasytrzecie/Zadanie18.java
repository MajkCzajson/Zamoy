package pl.tomaszidzikowski.klasytrzecie;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/*
* Napisz program, który wczytuje liczby z pliku.
* Znajduje części wspólne i liczby które znajdują się w pierwszym pliku , a w drugim ich nie ma.
 */
public class Zadanie18 {
    public static void main(String[] args) throws IOException {
        List<String> list1=Files.readAllLines(Paths.get("plik1.txt"));
        List<String> list2=Files.readAllLines(Paths.get("plik2.txt"));
        Set<String> set1=new HashSet<>(list1);
        Set<String> set2=new HashSet<>(list2);
        System.out.println(set1);
        System.out.println(set2);
        Set<String> wspolne=new HashSet<>(set1);
        wspolne.retainAll(set2);
        System.out.println(wspolne);
        Set<String> roznica=new HashSet<>(set1);
        wspolne.removeAll(set2);
        System.out.println(roznica);


    }
}

