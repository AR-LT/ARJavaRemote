package advanced.streams;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brand", "Michael");

        // Stream naudojami tik su Java Collection : List, Map ir t.t.
       // Sunkus metodas ir ilgas
        // Ar yra bent vienas vardas, kurio ilgis >3
        boolean isThereNameWhichLengthIsGtThan3 = false;
        for (int i=0; i< names.size(); i++){
            if (names.get(i).length() >3){
                isThereNameWhichLengthIsGtThan3 = true;
                break;
            }
        }
        System.out.println(" Ar yra bent vienas vardas, kurio ilgis >3 " + isThereNameWhichLengthIsGtThan3);
        // Ar visu vardu ilgiai yra >3
        boolean areAllNameLenghtsGtThat3 = false;
        int counter = 0;
        for (int i=0; i< names.size(); i++){
            if (names.get(i).length() >3){
                counter ++;
            }
        }
        if (counter== names.size()){
            areAllNameLenghtsGtThat3 = true;
        }
        System.out.println(" Ar visu vardu ilgiai yra >3 " + areAllNameLenghtsGtThat3);

        //Sunkus metodas baigtas

        // Lengvas ir greitas b8das
        boolean isThereNameWhichLengthIsGtThan4 = names.stream().anyMatch(name ->name.length() >3);
        System.out.println(" Ar yra bent vienas vardas, kurio ilgis >3 " + isThereNameWhichLengthIsGtThan4);
        boolean areAllNameLenghtsGtThat4 = names.stream().allMatch(name->name.length()>3);
        System.out.println(" Ar visu vardu ilgiai yra >3 " + areAllNameLenghtsGtThat4);

    }
}
