package homeWork.hw_02_13.Task7;

public class Developer extends Person {
    private String programmingL;
    public Developer(String name, int age, String programmingL){
        super(name, age);
        this.programmingL = programmingL;
    }
    @Override
    public String kvalifikacija() {
        return "Kandidato zinios : " + programmingL;
    }
}
