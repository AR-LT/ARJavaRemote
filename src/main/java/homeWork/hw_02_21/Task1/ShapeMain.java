package homeWork.hw_02_21.Task1;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle("Apskritimas", 15);
        Rectangle rectangle = new Rectangle("Kvadratas", 12, 8);
        RightAngleRectangle rightAngleRectangle = new RightAngleRectangle("Statusis trikampis", 6, 9);


        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(rightAngleRectangle.getArea());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(InputBufferd.RESULT_FILE_LOCATION))){
            String text = circle.getArea() + "\n" + rectangle.getArea() + "\n" + rightAngleRectangle.getArea();
            bw.write(text);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
