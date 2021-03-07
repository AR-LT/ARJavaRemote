package fundamentals.examples;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) return;
        for (int i = 2; i < n; i++) {
            if (Primityvus(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean Primityvus(int k) {
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                return false;
            }
        }
    return true;
    }

}
