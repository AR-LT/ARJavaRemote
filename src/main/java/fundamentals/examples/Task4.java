package fundamentals.examples;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite sveikaji skaiciu: ");
        int n = scanner.nextInt();
        int res1, res2;
        for (int i=1; i<=n; i++){
            res1 = i % 3;
            res2 = i % 7;
            if (res1==0 && res2==0){
                System.out.println("Fizz buzz");
            } else  if (res1 == 0){
                System.out.println("Fizz");
            } else  if (res2 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
