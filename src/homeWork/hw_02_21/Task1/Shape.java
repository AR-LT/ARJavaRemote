package homeWork.hw_02_21.Task1;

public abstract class Shape {
    protected String shapeDescription;

    public Shape(String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }
    public abstract String getArea();
}
