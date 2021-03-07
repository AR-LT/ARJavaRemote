package fundamentals.examples;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1;
        int sk1=0, sk2;
        String seka = String.valueOf(sk1);

        while (i <10){
            sk2 = sc.nextInt();
            if (sk2>sk1){
                seka = seka+ String.valueOf(sk2);
            } else {
                seka = String.valueOf(sk2);
            }
            i++;
            sk1 = sk2;

        }
        System.out.println(seka + ", ");
    }
}
