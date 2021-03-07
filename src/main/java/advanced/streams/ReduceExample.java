package advanced.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael", "Brad");
        String text = names.stream()
                .reduce("", (currentValue, element) ->(currentValue.isEmpty() ? "" : currentValue+" : ")+element);
        // 1 - iteracija - "" - pradine reiksme - tusca, currentValue = "", element = "Tom", currentValue.isEmpty() ? - tikrina ar pirma reiksme lygi nuliui
        System.out.println(text);

        int num = names.stream()
                .map(name ->name.length())
                .reduce(0, (currentSum, number)-> (number >3 ?1:0) + currentSum);
        System.out.println(num);
        // 1-a iteracija - Pirmine reiksme yra 0, currentSum = 0, number =3 , salygos netenkina ir reiksmes nekeicaia 0+0=0 currentSum = 0
        // 2-a iteracija - currentSum = 0, number =7 , salygos tenkina ir reiksmes keicaia 0+1=1 currentSum = 1
        // 3-a iteracija - currentSum = 0, number =7 , salygos tenkina ir reiksmes keicaia 1+1=2 currentSum = 2
        // 4-a iteracija - currentSum = 0, number =4 , salygos tenkina ir reiksmes keicaia 2+1=3 currentSum = 3
        // po visu iteraciju num = 3

        // reduce (pradine reiksme, (sumine/tarpine reiksme, iteruojama reiksme) -> "atliekama salyga pagal reikalavimus")
    }
}
