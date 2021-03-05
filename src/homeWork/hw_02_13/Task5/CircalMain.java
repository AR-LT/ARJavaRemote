package homeWork.hw_02_13.Task5;

public class CircalMain {
    public static void main(String[] args) {
        Circle circle = new Circle("Juodas", 15);
        Circle.Area area = circle.new Area();
        area.Plotas();
        Circle.Perimeter perimeter = circle.new Perimeter();
        perimeter.ApskritimoIlgis();
        System.out.println("Apskritimo spalva: " + circle.getColor());
        System.out.println("Apskritimo plotas: " + circle.getArea());
        System.out.println("Apskritimo perimetras: " + circle.getPerimeter());




    }
}
