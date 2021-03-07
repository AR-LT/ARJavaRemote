package fundamentals.examples;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x=3;
        String[][] arrStr = new String[x][y];
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                arrStr[i][j] = "A" + j;
                System.out.print(arrStr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
