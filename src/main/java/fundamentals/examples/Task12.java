package fundamentals.examples;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekstas = scanner.nextLine();
        skaiciavimas(tekstas);
    }
    private static void skaiciavimas(String x){
        char[ ] ch = x.toCharArray();
        int r, t=0;
        double sk = 0;
        for (int i=0; i<x.length(); i++){
            if (Character.isSpaceChar(ch[i]) ){
                t++;
            }
        }
            r= x.length();
            sk = (double) t*100/r;
            System.out.println("Bendras teksto simboliu skaicius: " + r);
            System.out.println("Tarpu sakicius: " + t);
            System.out.println("Tarpu kiekis procentais tekste: " + sk + " %");

    }



}

