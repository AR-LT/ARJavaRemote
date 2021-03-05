package homeWork.hw_02_13.Task3;

public class CarMain {
    public static void main(String[] args) {
        Car[] masyvas = new Car[3];
        masyvas[0] = new Car("Audi A8", 2018, "sedan", 4.2, 85000);
        masyvas[1] = new Car("Skoda SuperB", 2014, "touring", 2.5, 30000);
        masyvas[2] = new Car("BMW X5", 2017, "suv", 3, 50000);

        System.out.println("Naujausias automobilis yra: " + modernCar(masyvas) + " metų.");
        System.out.println("Vidutinė automobilio kaina yra: " + averageCarPrice(masyvas) + " eurų.");
        System.out.println("Automobilis kurio tipas - sedan: " + typeCar(masyvas));
        System.out.println("Brangiausias automobilis: " + maxPrice(masyvas));
    }

    private static int modernCar(Car[] masyvas) {
        int data = 2021;
        int minValue =100;
        int skirtumas, carYear = 0;
        for (int i = 0; i < masyvas.length; i++) {
            skirtumas = data - masyvas[i].getYear();
            if (skirtumas < minValue) {
                minValue = skirtumas;
                carYear = masyvas[i].getYear();
            }
        }
        return carYear;
    }

    private static Double averageCarPrice(Car[] masyvas) {
        double priceAverage, priceSum = 0;
        for (int k = 0; k < masyvas.length; k++) {
            priceSum = priceSum + masyvas[k].getPrice();
        }
        priceAverage = priceSum / masyvas.length;
        return priceAverage;
    }
 //   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 // Abejoju ar esant 2 ir daugiau spausdins visus modelis, manau kad spausdina tik paskutini.

    private static String typeCar(Car[] masyvas) {
    String carType = null, type = "sedan";
        for (int k = 0; k < masyvas.length; k++) {
          if (type.equals(masyvas[k].getType())){
              carType = masyvas[k].getModel();
          }
        }
        return carType;

    }
private static String maxPrice (Car[] masyvas){
double pricemax= 0;
String model = null;
for (int i=0; i< masyvas.length; i++){
    if (masyvas[i].getPrice() > pricemax){
        pricemax = masyvas[i].getPrice();
        model = masyvas[i].getModel();
    }
}
   return  model;
}

}
