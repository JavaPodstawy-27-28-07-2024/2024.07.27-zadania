import java.util.Random;

public class Zadanie6 {
    /*
    wygeneruj tablice losowych (0 - 999) liczb 2D (10x10) -
    niech program wypisze tablice na ekranie (w formie kwadratu)
    program ma policzyć średią każdego wiersza
    program ma wypisać największą średnią i nuymer wiersza w którym ona wystąpiła
     */
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        Random losowacz = new Random();
        double max = 0;
        int maxRow = 0;
        for (int row = 0; row < 10; row++) {
            int sum = 0;
            for (int col = 0; col < 10; col++) {
                tab[row][col] = losowacz.nextInt(0, 1000);
                System.out.print(tab[row][col] + "\t");
                sum += tab[row][col];
            }
            double avg = sum / 10.0;
            if (avg > max) {
                max = avg;
                maxRow = row;
            }
            System.out.println();
        }
        System.out.println("Najwieksza srednia: " + max);
        System.out.println("Numer wiersza: " + maxRow);
    }
}
