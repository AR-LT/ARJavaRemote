package homeWork.hw_02_21.Task1;

public class Rectangle extends RightAngleRectangle{

    public Rectangle(String shapeDescription, double width, double height) {
        super(shapeDescription, width, height);
    }

    @Override
    public String getArea() {
        return shapeDescription +" - plotas " + (width * height) ;
    }
}
