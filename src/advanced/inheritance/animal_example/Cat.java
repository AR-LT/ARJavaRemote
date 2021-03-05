package advanced.inheritance.animal_example;

public class Cat extends Animal {
    private String color;


    public Cat(String color, String voice, boolean mammel){
        super(voice, mammel);
        this.color = color;

    }

    @Override
    public String yieldVoice() {
        return "Cat voice : " + voice;
    }
}
