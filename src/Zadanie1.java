public class Zadanie1 {
    /*
    wygeneruj tablice liczb 0 - 99
    wyswietl kazda liczbe podzielna przez 4 ktora nie jest zerem
     */
    public static void main(String[] args) {
        int[] tab = new int[100];
        for(int i = 0; i < 100; i++) {
            tab[i] = i;
            if(tab[i] % 4 == 0 && tab[i] != 0) {
                System.out.println(tab[i]);
            }
        }

        /*for(int element : tab) {
            if(element % 4 == 0 && element != 0) {
                System.out.println(element);
            }
        }*/
    }
}
