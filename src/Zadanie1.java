public class Zadanie1 {
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
