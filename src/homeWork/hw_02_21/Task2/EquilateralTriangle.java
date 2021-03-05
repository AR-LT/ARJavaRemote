package homeWork.hw_02_21.Task2;

public class EquilateralTriangle implements RegularPolygon {
    private double length;

    public EquilateralTriangle(int length) {
        this.length = length;
    }


    public double getSideLength() {
        return length;
    }

    @Override
    public int getNumSides() {
        return 3;
    }
}
