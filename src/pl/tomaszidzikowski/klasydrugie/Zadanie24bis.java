package pl.tomaszidzikowski.klasydrugie;

import java.util.HashMap;
import java.util.Scanner;

public class Zadanie24bis {
    public static HashMap<Character,Integer> mapa;

    public static void wstaw(char znak){
        if (mapa.containsKey(znak)) mapa.replace(znak,mapa.get(znak)+1);
        else mapa.put(znak,1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        mapa=new HashMap<>();
        String word=scanner.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            switch(word.charAt(i)){
                case 'a': wstaw('a');break;
                case 'e': wstaw('e');break;
                case 'i': wstaw('i');break;
                case 'o': wstaw('o');break;
                case 'u': wstaw('u');break;
                case 'y': wstaw('y');break;
            }
        }
        if (!mapa.isEmpty())
        System.out.println(mapa);
        else System.out.println("Mapa jest pusta");
    }
}
