package homeWork.hw_02_13.Task7;

public abstract class Person {
    protected String name;
    protected int age;
    public Person (String name, int age ){
        this.name = name;
        this.age = age;
    }
    public abstract String kvalifikacija();
    public void printPerson(){
        System.out.println(name+" "+age);
    }


}
