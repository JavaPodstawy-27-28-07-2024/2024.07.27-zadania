import java.util.Random;

public class Zadanie2 {
    /*
    wygeneruj tablice (100 elementow) losowych liczb (0 - 200)
    poszukac w tej tablicy najwiekszej liczby
     */
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random losowacz = new Random();
        tab[0] = losowacz.nextInt(0, 201);
        System.out.print(tab[0] + " ");
        int max = tab[0];
        for(int i = 1; i < 100; i++) {
            tab[i] = losowacz.nextInt(0, 201);
            System.out.print(tab[i] + " ");
            if(tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println();

        System.out.println("Najwieksza liczba w tablicy: " + max);
    }
}
