package advanced.annotations.depricatiod;

import java.util.List;

public class Calculator {
    // 1 kalkuletoriaus versija
    @Deprecated
    public int sum(int firstNum, int secondNum){
        return firstNum + secondNum;
    }
    // 2 kalkuletoriaus versija
    public int sum (List<Integer> numbers){
        int result = 0;
        for (Integer number : numbers){
            result += number;
        }
        return result;
    }
}
