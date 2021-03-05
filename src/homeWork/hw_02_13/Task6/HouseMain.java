package homeWork.hw_02_13.Task6;


public class HouseMain {
    public static void main(String[] args) {
        House[] masyvas = new House[3];
        masyvas[0] = new House("Vilijampole", "fitted", 150, 2011);
        masyvas[1] = new House("Alksotas", "partially", 120, 2014);
        masyvas[2] = new House("Senamiestis", "fitted", 180, 1951);
        System.out.println(houseNew(masyvas));
        System.out.println(houseCondition(masyvas));
        System.out.println(houseSmollest(masyvas));
    }
    private static String houseNew(House[] masyvas) {
        int data = 2021;
        int minValue =100;
        int skirtumas;
        String house = null;
        for (int i = 0; i < masyvas.length; i++) {
            skirtumas = data - masyvas[i].getBuiltYear();
            if (skirtumas < minValue) {
                minValue = skirtumas;
                house = "Naujausias namas stovi: "+masyvas[i].getDistrict()+", jo plotas: " + masyvas[i].getHouseArea()+" m2, irengimas: "+ masyvas[i].getCondition();
            }
        }
        return house;
    }
    private static String houseCondition(House[] masyvas) {
        String conditionHouse = null, type ="fitted";
        for (int i = 0; i < masyvas.length; i++) {
            if (type.equals(masyvas[i].getCondition())) {
                conditionHouse= "Įrengtas namas stovi: "+masyvas[i].getDistrict();
            }
        }
       return conditionHouse;
    }
    private static String houseSmollest(House[] masyvas) {
        double minValue = masyvas[0].getHouseArea();
        String area = null;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i].getHouseArea()< minValue) {
                minValue = masyvas[i].getHouseArea() ;
            }
            area = "Mažiausias namas yra: "+minValue+" m2";
        }
        return area;
    }
}
