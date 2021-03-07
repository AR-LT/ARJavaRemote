package basics;

import fundamentals_testing.Calculetor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionExample {
    @Test
    public void testAssetEquals(){
        //given
        Calculetor calculetor = new Calculetor();

        //when
        int result = calculetor.add(10,8);
        //then
        Assertions.assertEquals(18, result);
    }
    @Test
    public void testCalculatorSubtraction(){
        //given
        Calculetor calculetor = new Calculetor();

        //when
        int result = calculetor.subtract(10,8);
        //then
        Assertions.assertEquals(2, result);
    }
    @Test
    public void testCalculatormultiplication(){
        //given
        Calculetor calculetor = new Calculetor();

        //when
        int result = calculetor.multiplication(10,8);
        //then
        Assertions.assertEquals(80, result);
    }
    @Test
    public void testCalculatorDivision(){
        //given
        Calculetor calculetor = new Calculetor();

        //when
        int result = calculetor.division(16,8);
        //then
        Assertions.assertEquals(2, result);
    }

}
