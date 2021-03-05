package homeWork.hw_02_13.Task4;




public class MobileMain {
    public static void main(String[] args) {
        Mobile[] masyvas = new Mobile[3];
        masyvas[0] = new Mobile("S21 Ultra", "Samsung", 690);
        masyvas[1] = new Mobile("K52", "LG", 189);
        masyvas[2] = new Mobile("iPhone 11", "Apple", 769);
        System.out.println("Brangiausias telefonas: " + expensive(masyvas));

    }
    private static String expensive(Mobile[] masyvas) {
        double price = 0;
        String mobile = null;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i].getPrice() > price) {
                price = masyvas[i].getPrice();
                mobile = masyvas[i].getManufacturer()+ " " + masyvas[i].getModel();
            }
        }
        return mobile;
    }

}
