public class Zadanie5 {
    /*
    program ma wypisać kolejne liczby od 1 do 100
    jeżeli liczba jest podzielna przez 3 ma dopisać do niej "Fizz"
    jeżeli jest podzielna przez 5 ma dopisać do niej "Buzz"
    jeżeli jest podzielna przez 3 i 5 jednocześnie to ma dpoisać "Fizz Buzz"
    1
    2
    3 Fizz
    4
    5 Buzz
    6 Fizz
    7
    8
    9 Fizz
    10 Buzz
    11
    12 Fizz
    13
    14
    15 Fizz Buzz
    16 ..
     */

    public static void main(String[] args) {
        for(int i = 1; i < 101; i++) {
            System.out.print(i);
            if(i % 3 == 0) {
                System.out.print(" Fizz");
            }
            if(i % 5 == 0) {
                System.out.print(" Buzz");
            }
            System.out.println();

            /*if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Fizz Buzz");
            } else if(i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if(i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }*/
        }
    }
}
