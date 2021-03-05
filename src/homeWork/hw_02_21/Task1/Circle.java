package homeWork.hw_02_21.Task1;

public class Circle extends Shape {

    private double radius;
    public Circle(String shapeDescription, double radius) {
        super(shapeDescription);
        this.radius = radius;
    }

    @Override
    public String getArea() {
        return  shapeDescription + " - plotas " + radius * Math.pow(Math.PI, 2);
    }
}
