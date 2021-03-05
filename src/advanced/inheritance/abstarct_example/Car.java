package advanced.inheritance.abstarct_example;

public class Car extends Vechicle {

    private String model;

    public Car(String model, int maxSpeed) {
        super(maxSpeed);
        this.model = model;
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed + 20;
    }
}
