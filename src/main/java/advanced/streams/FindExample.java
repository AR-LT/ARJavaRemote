package advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brand", "Michael");

        Optional<String> anyName = names.stream().findAny(); // grazina atsitiktini varda is saraso
        System.out.println("Any name: "+ anyName.orElse("list was empty"));

        System.out.println("Any name: "+ names.stream().findFirst().get());
    }
}
