/*
Užduotis
Write an application calculating BMI (Body Mass Index) and checking if it’s optimal or not.
Your application should read two variables: weight (in kilograms, type float)
and height (in centimeters, type int). BMI should be calculated given following formula:
BMI = weight (kg) / height (m)2
The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values.
Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above.

 */

package fundamentals.examples;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Iveskite savo kuno svori (kilogramais): ");
        float w = scanner.nextFloat();
        System.out.println(" Iveskite savo ugi (centimetrais): ");
        int h1 = scanner.nextInt();
        double h2=h1;
        double BMI;
        h2= (h2/100);
        h2 =Math.pow(h2,2);
        BMI = w/h2;
    if (BMI <= 18.5 || BMI >=24.9){
        System.out.println("BMI not optimal" );
    } else {
        System.out.println("BMI optimal");
    }


    }
}
