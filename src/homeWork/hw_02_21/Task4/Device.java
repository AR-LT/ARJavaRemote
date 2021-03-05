package homeWork.hw_02_21.Task4;

public class Device {
    public String name;
    public double price;
    public String quality;
    public String description;

    public Device(String name, double price, String quality, String description) {
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
