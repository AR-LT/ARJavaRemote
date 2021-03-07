package basics;

import fundamentals_testing.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void shouldCalculateCirclePerimeter(){
        //given
        Circle circle = new Circle(60);
        //when
        int result = circle.calculateCircleLength();
        //then
        Assertions.assertEquals(376,result);

    }
    @Test
    public void shouldCalculateCircleArea(){
        //given
        Circle circle = new Circle(60);
        //when
        int result = circle.calculateCircleArea();
        //then
        Assertions.assertEquals(11309,result);

    }
}
