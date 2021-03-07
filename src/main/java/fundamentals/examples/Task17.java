package fundamentals.examples;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        LocalDate from = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        LocalDate to = LocalDate.parse(data);
        Period period = Period.between(from, to);
        System.out.println(period.getDays() + " dienos");
    }
}
