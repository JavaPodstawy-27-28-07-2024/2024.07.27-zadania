import java.util.Random;

public class HowToRandom {
    public static void main(String[] args) {
        Random losowacz = new Random();
        int x = losowacz.nextInt(0,101);
        System.out.println(x);
    }
}
