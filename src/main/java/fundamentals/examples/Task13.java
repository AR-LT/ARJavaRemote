package fundamentals.examples;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekstas = scanner.nextLine();
        String [] zodis = tekstas.split("\\s");
        for (int i=0; i< zodis.length; i++){

            System.out.print(zodis[i]+ " "+ zodis[i] + " ");

        }


    }

}
