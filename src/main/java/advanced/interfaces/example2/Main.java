package advanced.interfaces.example2;

public class Main {
    // metodas Main
    public static void main(String[] args) {
        // Balloon metodas
        Balloon balloon = new Balloon(50);
        System.out.println(balloon.cakculateMaxSpeed());
        System.out.println(balloon.canFly("bed"));
        // Plane metodas
        Plane plane = new Plane(600);
        System.out.println(plane.cakculateMaxSpeed());
        System.out.println(plane.canFly("bed"));


    }
}
