package homeWork.hw_02_21.Task2;

public class Square implements RegularPolygon {
    private int length;
    public Square(int length){
        this.length = length;
    }

    public double getSideLength() {
        return length;
    }
    @Override
    public int getNumSides() {
        return 4;
    }
}
