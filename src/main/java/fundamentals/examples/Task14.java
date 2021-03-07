package fundamentals.examples;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite pirmą skaičių: ");
        char l1 = scanner.next().charAt(0);
        System.out.println("Įveskite antrą skaičių: ");
        char l2 = scanner.next().charAt(0);
        int l3 = l1 -96 ;
        int l4 = l2 -96;
        int k;
        if (l3>l4){
            k = l3-l4-1;
            System.out.println("Simboliu kiekis tarp raidziu : " +k);
        } else {
            k = l4-l3-1;
            System.out.println("Simboliu kiekis tarp raidziu : " +k);
        }



    }

}
