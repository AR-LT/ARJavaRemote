package homeWork.hw_02_21.Task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final String FILE_LOCATION = "D:\\Kursai\\Java Coding\\src\\homeWork\\hw_02_21\\Task4\\Result.txt";

    public static void main(String[] args) {

        List<Company> companies = companyDeviceList();
        System.out.println(deviceExpensive(companies));
        System.out.println(comapanyOfTechnologies(companies));


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_LOCATION))) {
            bw.write(deviceExpensive(companies) + "\n");
            bw.write(comapanyOfTechnologies(companies));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // čia reikia pastudijuoti
    private static String expensiveDevice(List<Company> companies) {
        Device expensiveDevice = companies.get(0).getDevices().get(0);
        for (Company company : companies) {
            for (Device device : company.getDevices()) {
                if (expensiveDevice.getPrice() < device.getPrice()) {
                    expensiveDevice = device;
                }
            }

        }
        return expensiveDevice.toString();
    }

    //*****************
    private static String deviceExpensive(List<Company> companies) {
        List<String> dev = new ArrayList<>();
        for (Company company : companies) {
            Device expensive = new Device("a", 0, "A", "testine preke");
            for (Device device : company.getDevices()) {
                if (expensive.getPrice() < device.getPrice()) {
                    expensive = device;
                }
            }
            dev.add("The most expensive product of the company : " + company.name + " is " + expensive.getName() + "\n");
        }
        return dev.toString();
    }

    private static String comapanyOfTechnologies(List<Company> companies) {
        List<String> tech = new ArrayList<>();
        for (Company company : companies) {
            if (company.getProductionType() == ProductionType.TECHNOLOGIES) {
                tech.add("Companys name  with `productType` -> TECHNOLOGIES: " + company.toString());
                tech.add("\n");
            }
        }
        return tech.toString();
    }

    private static List<Company> companyDeviceList() {
        return Arrays.asList(
                new Company("Žemaitijos pienas", "Sedos g. 35, Telšiai", ProductionType.FOOD, Arrays.asList(
                        new Device("Sūris Džiugas brandintas 24 mėn.", 3.18, "Aukščiausia", "Kietasis sūris"),
                        new Device("Ekologiškas jogurtas Dobilas", 1.39, "Gera", "Ekologiškas jogurtas"),
                        new Device("Sviestas Šeimininkė", 2.19, "Gera", "Tepamas sviestas")
                )),
                new Company("Ginalas", "Esperanto g. 26, Kazlų Rūda", ProductionType.GARDEN_TOOLS, Arrays.asList(
                        new Device("Vejos robotas iMOW", 1399.00, "Normali", "Vejos pjovimo robotas su galinga baterija"),
                        new Device("Elektrinis vejos aeratorius", 179.00, "Aukšta", "Kompaktiškas elektrinis aeratorius su aeravimo velenu")
                )),
                new Company("iStore", "Smolensko g. 10D - 38, Vilnius", ProductionType.TECHNOLOGIES, Arrays.asList(
                        new Device("MacBook Air 13.3", 1129.00, "Aukšta", "Ploniausias ir lengviausias Apple nešiojamasis kompiuteris"),
                        new Device("iPhone 12 Pro", 1169.00, "Aukščiausia", "128GB talpos tamsiai pilkos spalvos telefonas iPhone 12 Pro")
                )),
                new Company("Krasta Auto", "Ozo g. 10A, Vilnius", ProductionType.AUTOMOBILES, Arrays.asList(
                        new Device("BMW 2 serija", 65000, "Aukščiausia", "Grand kupė"),
                        new Device("BMW 4 serija", 95000, "Aukščiausia", "Kabrioletas")
                )),
                new Company("Kilobaitas", "Piliakalnio g. 23, Karmėlava, Kauno r.", ProductionType.TECHNOLOGIES, Arrays.asList(
                        new Device("LCD monutorius", 244, "Vidutinė", "28 colių LCD minitorius"),
                        new Device("Televizorius", 766, "Aukšta", "55 colių 4K/S"),
                        new Device("Windows 10 PRO", 214, "Vidutinė", "Operacinė sistema")
                ))
        );
    }
}

