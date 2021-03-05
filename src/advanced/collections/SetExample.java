package advanced.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> visitedCities = new HashSet<>();
        visitedCities.add("Vilnius");
        visitedCities.add("Kaunas");
        visitedCities.add("Klaipeda");
        visitedCities.add("Vilnius");
        visitedCities.add("Panevezys");

        System.out.println("original set");
        for (String city : visitedCities) {
           System.out.println(city);
        }
        System.out.println("edited set");
        System.out.println("trina Klaipeda");
        visitedCities.remove("Klaipeda");
        for (String city : visitedCities) {
            System.out.println(city);
        }
        if (!visitedCities.contains("Madrid")){
            System.out.println("Set does not contain Madrid");
        }
    }
}
