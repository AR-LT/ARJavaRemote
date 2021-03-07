package homeWork.hw_02_13.Task3;

public class Car {
    private String model, type;
    private int year;
    private double engine, price;

    public Car (String model, int year, String type, double engine, double price ){
    this.model = model;
    this.year = year;
    this.type = type;
    this.engine = engine;
    this.price = price;

    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public double getEngine() {
        return engine;
    }

    public double getPrice() {
        return price;
    }



}
