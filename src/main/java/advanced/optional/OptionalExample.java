package advanced.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
 /*    Optional<String> text =Optional.ofNullable(null);
     if (text.isPresent()) {
         text.get().charAt(4);
     } else {
         System.out.println("Text is not initialized");
     }
     */
        Optional<String> stringOptional1 = Optional.of("Hello");
        Optional<String> stringOptional2 = Optional.of("world");
        Optional<String> stringOptional3 = Optional.ofNullable(null);
        // Lambda expression
        stringOptional1.ifPresent(variable -> System.out.println(variable)); // Lambda expression
        String  text = stringOptional2.orElse("Tekstas");
        String value =  stringOptional3.orElse("Hello world!");
        System.out.println(text);
        System.out.println(value);
    }
}
