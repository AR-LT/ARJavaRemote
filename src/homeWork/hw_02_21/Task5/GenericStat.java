package homeWork.hw_02_21.Task5;

import java.util.List;

public class GenericStat<T> {
    public static <T> void print(List<T> list){
        System.out.println(list.get(list.size()-1));
    }
}
