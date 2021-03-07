package fundamentals.examples;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sk = scanner.nextInt();
        double res=0;
        for (int i=1; i<=sk; i++){
            res = res + 1.0/i;
        }
        System.out.println(res);
    }
}
