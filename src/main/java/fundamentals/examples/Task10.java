package fundamentals.examples;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sk = scanner.nextInt();
        System.out.println(SkaiciuSuma(sk));
    }
    private static int SkaiciuSuma (int sk) {
    int result =0, num1;
    while (sk>0) {
        num1 = sk % 10;
        result = result + num1;
        sk = sk/10;
            }
        return result;
    }
}
