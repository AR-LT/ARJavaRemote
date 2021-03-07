package fundamentals.examples;

import sun.applet.Main;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite a reiksme : ");
        int a = scanner.nextInt();
        System.out.println("Iveskite b reiksme : ");
        int b = scanner.nextInt();
        System.out.println("Iveskite c reiksme : ");
        int c = scanner.nextInt();
        double delta, x1, x2;
        delta = Math.pow(b,2) - 4*a*c;
        if (delta >=0){
            x1 = (-b - Math.sqrt(delta)) / 2 / a;
            x2 = (-b + Math.sqrt(delta)) / 2 / a;
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.println("Delta negative");
        }
    }
}
