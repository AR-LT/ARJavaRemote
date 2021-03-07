package fundamentals.examples;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sk = scanner.nextInt();
        if (sk <=0) return;
        System.out.println(Fibonacci(sk));
    }
private static int Fibonacci (int sk){
        int fib = 0, x1=0 , x2 = 1;
        for (int i=2; i <=sk; i++){
            fib = x1 + x2;
            x1 = x2;
            x2 = fib;
        }
        return fib;
}
}
