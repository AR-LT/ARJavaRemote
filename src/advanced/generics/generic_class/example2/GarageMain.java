package advanced.generics.generic_class.example2;

public class GarageMain {
    public static void main(String[] args) {
        //Objektas Car
        // (car)  - klases objektas
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

 //       CarGarage carGarage = new CarGarage(car);
   //     MotorcycleGarage motorcycleGarage = new MotorcycleGarage(motorcycle);

        // kvie2iamas CarGarage klase ir ten atliekami veiksmai
   //     carGarage.repairCar();
   //     motorcycleGarage.repairMotorcucle();

        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);

        carGarage.repairVehicle();
        motorcycleGarage.repairVehicle();

    }
}
