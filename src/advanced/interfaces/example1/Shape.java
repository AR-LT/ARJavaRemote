package advanced.interfaces.example1;

public interface Shape {
    double getArea();
    double getPerimeter();

    // void nieko negražina
    //default metodai privalo tureti default implementacija
    default void printShape() {
        System.out.println("Shape:" + this.getClass().getSimpleName());
    }

}
