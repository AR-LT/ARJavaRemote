package homeWork.hw_02_21.Task3;

public class Developer extends Person {
    private int ageOfExperience;
    public Developer(String name, int ageOfExperience){
        super(name);
        this.ageOfExperience = ageOfExperience;
    }


    @Override
    public String printPerson() {
        return name+" " + ageOfExperience;
    }
}

