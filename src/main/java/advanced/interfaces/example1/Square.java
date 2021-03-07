package advanced.interfaces.example1;

public class Square implements Shape{
    //Elementas
    private double lenght;
    // Konstruktorius
    public Square(double lenght){
        this.lenght= lenght;
    }

    //implementacijos
    @Override
    public double getArea() {
        //Keliam skaiciu laispsniu ( lenght ką keliam, "2" kokiu laipsniu keliam)
        return Math.pow(lenght,2);
    }
    //implementacijos
    @Override
    public double getPerimeter() {
        return 4*lenght;
    }
}
