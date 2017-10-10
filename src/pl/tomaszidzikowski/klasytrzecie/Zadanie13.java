package pl.tomaszidzikowski.klasytrzecie;
/*
* Napisz program, który doda 100 000 elementów "a" do Stringa i tyle samo do StringBuildera
* i sprawdzi czas działania obu operacji
 */
public class Zadanie13 {
    public static void main(String[] args) {
        String napis1 = "Klawiatura";
        StringBuilder napis2 = new StringBuilder("Klawiatura");
        long start1=System.nanoTime();
        for (int i = 0; i < 1e5; i++) {
            napis1=napis1+"a";
        }
        long stop1=System.nanoTime();

        long start2=System.nanoTime();
        for (int i = 0; i < 1e5; i++) {
            napis2.append("a");
        }
        long stop2=System.nanoTime();

        System.out.println("Dodowanie napisu do String trwało "+(stop1-start1)+" nanosekund");
        System.out.println("Dodawanie napisu do StringBuilder trwało "+(stop2-start2)+" nanosekund");
    }
}
