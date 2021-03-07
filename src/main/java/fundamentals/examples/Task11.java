package fundamentals.examples;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekstas = scanner.nextLine();
        String [] zodis = tekstas.split("[ ,.?]");
        if (zodis.length== 0){
            System.out.println("No text provided");
        }
        for (int i=0; i< zodis.length; i++){
            if (zodis[i].equals("Enough!") ){
                break;
            } else {
                System.out.print(zodis[i]);
            }
        }
        System.out.println(zodis.length);

    }
}
