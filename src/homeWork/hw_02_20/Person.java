package homeWork.hw_02_20;

public class Person implements Richer{
    private String name;
    private int amount;

    public Person(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }


    @Override
    public int findRicher() {
        return amount + 10;
    }
}
