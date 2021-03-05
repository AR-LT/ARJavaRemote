package advanced.interfaces.example1;

public class InterfaceExampleMain {
    public static void main(String[] args) {
        // metodas
        Rectangle rectangle = new Rectangle(4,3);
        //Spausdinimas
        System.out.println(rectangle.getArea());
        rectangle.printShape();
        // metodas
        Square square = new Square(2);
        //Spausdinimas
        System.out.println(square.getPerimeter());
        square.printShape();
    }
}
