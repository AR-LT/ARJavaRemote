/*
 UŽDUOTIS
Write an application that will read diameter of a circle (variable of type float)
and calculate perimeter of given circle. Firstly, assume π = 3.14.
Later, use the value of π from the built-in Math class

*/
package fundamentals.examples;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float diam = scanner.nextFloat();
        System.out.println(diam*3.14);
        System.out.println(diam * Math.PI);
    }
}
