package homeWork.hw_02_21.Task4;

import java.util.List;

public class Company {
    public String name;
    public String address;
    private ProductionType productionType;
    public List<Device> devices;

    public Company(String name, String address, ProductionType productionType, List<Device> devices) {
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        this.devices = devices;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ProductionType getProductionType() {
        return productionType;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public String toString() {
        return String.format(name);

    }
}
