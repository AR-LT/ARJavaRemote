package homeWork.hw_02_13.Task5;

public class Circle {
    private String color;
    private double radius, area, perimeter;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public class Area {
        public void Plotas() {
            area = Math.PI * radius * radius;
        }
    }

    public class Perimeter {
        public void ApskritimoIlgis() {
            perimeter = Math.PI * radius * 2;
        }
    }
}
