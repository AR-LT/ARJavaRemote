package homeWork.hw_02_13.Task2;

public class DogMain {
    public static void main(String[] args) {
        Dog[] masyvas = new Dog[3];
        masyvas[0] = new Dog("Žaibas", "Juodas", 5);
        masyvas[1] = new Dog("Tangis", "Rudas", 3);
        masyvas[2] = new Dog("Braitas", "Margas", 8);
        System.out.println("Vyriausio šuns vardas: " + oldestDog(masyvas));
        System.out.println("Šunų vidutinis amžius: " + averageAge(masyvas));
    }

    private static String oldestDog(Dog[] masyvas) {
        int maxAge = 0;
        String dogname = null;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i].getAge() > maxAge) {
                maxAge = masyvas[i].getAge();
                dogname = masyvas[i].getName();
            }
        }
        return dogname;
    }
    private static Double averageAge(Dog[] masyvas) {
        double ageAverage, sumAge = 0;
        for (int k = 0; k < masyvas.length; k++) {
            sumAge = sumAge + masyvas[k].getAge();
        }
        ageAverage = sumAge/masyvas.length;
        return ageAverage;
    }


}

