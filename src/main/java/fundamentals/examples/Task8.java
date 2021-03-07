package fundamentals.examples;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Iveskite pirma skaiciu: ");
        float sk1 = scanner.nextFloat();
        System.out.println(" Iveskite operatoriu: ");
        char op = scanner.next().charAt(0);
        System.out.println(" Iveskite antra skaiciu: ");
        float sk2 = scanner.nextFloat();
        double result;
        if (op != '+'&& op!='-' && op != '*' && op != '/' ){
            System.out.println("Invalid symbol");
        } else if (sk1 == 0 && sk2 ==0) {
            switch (op) {
                case '+':
                    result = sk1 + sk2;
                    System.out.println(result);
                    break;
                case '-':
                    result = sk1 - sk2;
                    System.out.println(result);
                    break;
                case '*':
                    result = sk1 * sk2;
                    System.out.println(result);
                    break;
                case '/':
                    result = sk2 + sk1;
                    System.out.println(result);
                    break;
            }
        }else {
            System.out.println("Cannot calculate");
        }


    }
}
