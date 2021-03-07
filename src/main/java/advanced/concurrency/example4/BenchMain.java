package advanced.concurrency.example4;

public class BenchMain {
    public static void main(String[] args) {

        Bench bench = new Bench(1);

        SeatTakerThreand STT1 = new SeatTakerThreand(bench);
        SeatTakerThreand STT2 = new SeatTakerThreand(bench);

        STT1.start();
        STT2.start();


    }
}
