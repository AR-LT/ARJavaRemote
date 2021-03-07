package homeWork.hw_02_21.Task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TwoItems intItems = new TwoItems(100, 15);
        TwoItems stringItems = new TwoItems("Kaunas", "Vilnius");
        System.out.println(intItems);
        System.out.println(stringItems);

        System.out.println("****");

        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        String text = "";
        int value = 0;

        for (int i=0; i<=10; i++){
            stringList.add(text);
            integerList.add(value);
            text= text + "ačiū ";
            value+=2;
        }
        GenericStat.print(stringList);
        GenericStat.print(integerList);
    }
}
