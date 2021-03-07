package advanced.inheritance.abstarct_example;

public class Ship extends Vechicle{

    private String model;
    public Ship(String model, int maxSpeed){
        super(maxSpeed);
        this.model = model;
    }


    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed - 20;
    }
}
