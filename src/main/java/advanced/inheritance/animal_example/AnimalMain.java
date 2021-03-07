package advanced.inheritance.animal_example;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat ("ginger", "miau", true);
        Dog dog = new Dog("doberman", "whoof", true);
        System.out.println(cat.yieldVoice());
        System.out.println(dog.yieldVoice());
        dog.printAnimal();
    }
}
