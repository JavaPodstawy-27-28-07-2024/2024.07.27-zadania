import java.util.Random;

public class Zadanie4 {
    /*
        wygeneruj tablice losowych liczb (100, 0-99)
        policz srednia liczb w tej tablicy
         */
    public static void main(String[] args) {
        int[] tab = new int[100];
        Random losowacz = new Random();
        int sum = 0;
        for(int i = 0; i < 100; i++) {
            tab[i] = losowacz.nextInt(0, 100);
            System.out.print(tab[i] + " ");
            sum = sum + tab[i];
        }
        System.out.println();
        double avg = sum / 100.0;

        System.out.println("Srednia: " + avg);
    }
}
