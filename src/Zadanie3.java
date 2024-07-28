public class Zadanie3 {
    /*
    wygeneruj macierz:
    1 2 3 4 ...
    2 4 6 8 ...
    3 6 9 12 ...
    4 8 12 16 ...

    10x10
     */
    public static void main(String[] args) {
        int[][] tab = new int[10][10];
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {
                tab[row][col] = (row + 1) * (col + 1);
                System.out.print(tab[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
