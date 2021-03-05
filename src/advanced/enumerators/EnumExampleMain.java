package advanced.enumerators;

public class EnumExampleMain {
    public static void main(String[] args) {
        System.out.println(Coffee.ARERICANO.name());

        // galima
        Coffee coffee=Coffee.valueOf("LATTE");
        System.out.println(coffee.name());

        System.out.println(carMaker.BMW.fullName +" "+ carMaker.BMW.establishedIn);
    }
}
