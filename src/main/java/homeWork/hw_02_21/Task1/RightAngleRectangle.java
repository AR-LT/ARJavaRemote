package homeWork.hw_02_21.Task1;

public class RightAngleRectangle extends Shape {

  protected  double width;
   protected double height;
    public RightAngleRectangle(String shapeDescription, double width, double height) {
        super(shapeDescription);
        this.height = height;
        this.width = width;
        this.height =height;
    }

    @Override
    public String getArea() {
        return shapeDescription +" - plotas "+ ((width * height)/2);
    }
}
