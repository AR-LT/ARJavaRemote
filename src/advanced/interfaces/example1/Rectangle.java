package advanced.interfaces.example1;

public class Rectangle implements Shape {
    //elementas
    private double height;
    private double width;
    //Konstruktorius
    public Rectangle (double height, double width){
        this.height = height;
        this.width = width;
    }
    //implementacijos
    @Override
    public double getArea() {
        return height*width;
    }
    //implementacijos
    @Override
    public double getPerimeter() {
        return (2*height)+(2*width);
    }

}
