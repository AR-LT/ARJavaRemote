package fundamentals.examples;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sk= new int[10];
        for (int i=0; i<sk.length; i++){
            sk[i] = sc.nextInt();
        }
        System.out.print(sk[1] );
      /*  if (int j=0; j<sk.length; j++){
            int a = sk[j];
        }*/

    }
}
