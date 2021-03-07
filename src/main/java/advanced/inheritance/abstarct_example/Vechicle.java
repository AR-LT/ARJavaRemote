package advanced.inheritance.abstarct_example;

public abstract class Vechicle {
    protected int maxSpeed;

    public Vechicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract int vehicleMaxSpeed();

}
