package advanced.inheritance.abstarct_example;

public class AbstractInheritanceExample {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 50);
        System.out.println(car1.vehicleMaxSpeed());
        Ship ship1 = new Ship("Titanikas", 50);
        System.out.println(ship1.vehicleMaxSpeed());
    }
}
