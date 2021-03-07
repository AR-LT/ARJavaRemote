package basics;

import fundamentals_testing.Calculetor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionExample {
    @Test
    public void testAssetEquals() {
        //given
        Calculetor calculetor = new Calculetor();

        //when
        int result = calculetor.add(10, 8);
        //then
        assertEquals(18, result);
    }

    @Test
    public void testCalculatorSubtraction() {
        //given
        Calculetor calculetor = new Calculetor();

        //when
        int result = calculetor.subtract(10, 8);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testCalculatormultiplication() {
        //given
        Calculetor calculetor = new Calculetor();

        //when
        int result = calculetor.multiplication(10, 8);
        //then
        assertEquals(80, result);
    }

    @Test
    public void testCalculatorDivision() {
        //given
        Calculetor calculetor = new Calculetor();

        //when
        int result = calculetor.division(16, 8);
        //then
        assertEquals(2, result);
    }

    @Test
    public void testAssertTrueFalse() {
        //given
        int firstNum = 5;
        int secondNum = 15;
        //when
        boolean condition = firstNum == secondNum;
        //then
        assertTrue(firstNum != secondNum);
        assertFalse(condition);
    }

    @Test
    public void testAssertNulOrNotNull() {
        //given
        String emtryText = null;
        String text = "sekamdienis";
        //when

        //then
        assertNull(emtryText); // patikrina ar lygu
        assertNotNull(text);
    }

    @Test
    public void testAssertArrayEquals() {
        //given
        int[] firstArr = {1, 2, 3};
        int[] secondsArr = {1, 2, 3};
        //when

        //then
        assertArrayEquals(firstArr, secondsArr); // patikrina ar lygu

    }

    @Test
    public void testAssertSameOrNotSame() {
        //given
        String text1 = "abc";
        String text2 = "abc";
        String text3 = new String("abc");
        //when

        //then
        assertSame(text1, text2);
        assertNotSame(text1, text3);

    }
}
