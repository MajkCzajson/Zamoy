package pl.tomaszidzikowski.klasydrugie;

import java.util.Random;

/*
* Napisz program, który losuję liczbę z przedziału <1,100>
 */
public class Zadanie22 {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println(random.nextInt(101));
    }
}
