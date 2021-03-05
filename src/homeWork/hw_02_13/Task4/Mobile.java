package homeWork.hw_02_13.Task4;

public class Mobile {
    private String model, manufacturer;
    private double price;
    public Mobile (String model, String manufacturer, double price){
        this.model = model;
        this.manufacturer = manufacturer;
        this. price = price;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }
}
