package advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAntMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael", "Brad");
        //Atspauzdinti vardus, kurie prasideda raide B
        names.stream()
                .filter(name-> name.startsWith("B")) // atfiltruoja pagal salyga "B" (startsWith) - pagal pirma sismboli
                .forEach(name-> System.out.println(name)); // spausdina kiekviena atfiltruota atsakyma

        // Paversti varadu sarasa i ju simboliu skaiciu
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())// Pakeicia vardus i vardu raidziu kieki
                .filter(lenght -> lenght>5) // atfiltruoja reiksmes kurios yra mazesnes uz 5
                .map(number ->number*10) // reiksme padaugina is 10
                .collect(Collectors.toList()); // sukuria sarasa
        System.out.println(nameLengths);

    }
}
