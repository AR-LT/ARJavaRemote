package basics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJTest {
 /*   @Test
    public void testAssertJMatcher() {
        //given
        String text = "abc";
        String[] textArr = {"abc", "dfg", "sde"};
        //when

        //then
        Assertions.assertThat(textArr)
                .hasSize(3)
                .contains(text)
                .contains("dfg")
                .doesNotContain("aaaaa");
    }
*/
    @Test
    public void shouldAddNumbers() {
        //given
        int num1 = 5;
        int num2 = -1;
        //when
        int result = num1 + num2;
        //then
        Assertions.assertThat(result)
                .isEqualTo(4)
                .isNotEqualTo(6)
                .isLessThan(200)
                .isGreaterThan(-10)
                .isBetween(-99,8);
    }
}
