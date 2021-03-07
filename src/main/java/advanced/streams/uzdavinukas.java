package advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class uzdavinukas {
    /*
        Su esamu žodžių sąrašu atlikite užduotis:
            * Sujunkite žodžius į vieną naudodami `reduce` funkciją;
            * Naudodami pradinį žodžių sąrašą, paverskite juos didžiosiomis raidėmis su `map` funkcija ir vėl
            sujunkite į vieną žodį su `reduce`;
            * Naudodami pradinį žodžių sąrašą, sujunkite į vientisą tekstą, kiekvieną žodį atskyrę ženklu `,`
            (tekstas negali prasidėti ar baigtis nurodytu ženklu);
                Atfiltruoti zodzius, kurie ilgesni, nei 5 simboliu ilgio
            * Naudodami pradinį žodžių sąrašą, išspausdinkite tuos, kurie turi raidę `o`.
            [Rytas, Lova, Durys, Automobilis, Katinas]

    */

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");
        String concatenatedString = words.stream()
                .reduce("", (concatenatedText, word) ->concatenatedText +""+ word);
        System.out.println(concatenatedString);
        String concatenatedStringInCapital = words.stream()
                .map(word -> word.toUpperCase())
                .reduce("", (concatenatedText, word) ->concatenatedText +""+ word);
        System.out.println(concatenatedStringInCapital);
        String concatenatedStringLength = words.stream()
                .filter(word->word.length()>5)
                .reduce("", (concatenatedText, word) ->(concatenatedText.isEmpty() ? "": concatenatedText +", ") + word);
        System.out.println(concatenatedStringLength);

    }
}
