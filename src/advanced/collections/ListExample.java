package advanced.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("Spain");
        visitedCountries.add("France");
        visitedCountries.add("Italy");
        visitedCountries.add("Germany");
        visitedCountries.add("Italy");
        visitedCountries.add("Spain");
        for (String country : visitedCountries) {
            System.out.println("original");
            System.out.println(country);
        }
        visitedCountries.remove("France");
        System.out.println("koreguotas, be FRANCE");
        for (String country : visitedCountries) {
            System.out.println(country);
        }
        System.out.println("tikrina, ar yra Germany - grazina True arba False");
        System.out.println(visitedCountries.contains("Germany"));
    }
}
