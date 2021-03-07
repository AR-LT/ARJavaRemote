package fundamentals.examples;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sk1;
    Random ran = new Random();
    int sk = ran.nextInt(100);
        while (true){
            sk1 = sc.nextInt();
            if (sk==sk1){
                System.out.println("Sveikiname Jus atspejote");
                break;
            } if (sk>sk1){
                System.out.println("Permazas");
            } else {
                System.out.println("Perdidelis");
            }

        }

    }
}
