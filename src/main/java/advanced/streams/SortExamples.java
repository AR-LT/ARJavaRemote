package advanced.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael", "Brad");
        // sukuria sarasa pagal abecele
        List<String> sortedNames =  names.stream()
                .sorted()
                .collect(Collectors.toList());
        //Sukuria sarasa is atvirkstine tvarka
        List<String> sortedNamesInReversOrder = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedNames);
        System.out.println(sortedNamesInReversOrder);
    }
}
