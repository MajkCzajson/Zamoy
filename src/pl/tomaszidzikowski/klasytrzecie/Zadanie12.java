package pl.tomaszidzikowski.klasytrzecie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* Napisz program, który będzie umożliwiał tłumaczenie słów z języka polskiego na angielski.
 */
public class Zadanie12 {
    public static Map<String,String> mapa=new HashMap<>();
    public static String translate(String word){
        return mapa.get(word);
    }
    public static void main(String[] args) {
        mapa.put("pies","dog");
        mapa.put("kot","cat");
        mapa.put("mysz","mouse");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj polskie słowo");
        String polishWord=scanner.nextLine();
        String englishWord=translate(polishWord);
        if (englishWord!=null) System.out.println("Jego tłumaczenie to "+translate(polishWord));
        else System.out.println("Brak tłumaczania. Dokonaj edycji");
    }
}
