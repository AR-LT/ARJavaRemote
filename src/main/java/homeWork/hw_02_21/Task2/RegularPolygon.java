package homeWork.hw_02_21.Task2;

public interface RegularPolygon {

    int getNumSides();
    double getSideLength();

    default void getPerimeter(){
        System.out.println("Figuros " + this.getClass().getSimpleName() + " perimetras yra  "+ (getSideLength()*getNumSides()));
    }
    default void getInteriorAngle() {
        System.out.println("Figuros "+ this.getClass().getSimpleName()+ " kampu suma yra "+ ((this.getNumSides()-2)*180));

    }
}
