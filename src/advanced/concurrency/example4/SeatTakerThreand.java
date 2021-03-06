package advanced.concurrency.example4;

public class SeatTakerThreand extends Thread { // extends Thread paveldime lygegretumo klase
    private Bench bench; // atributas

    public SeatTakerThreand(Bench bench) {
        this.bench = bench;
    }

    @Override
    public void run() {
      //  bench.takeASeat();  // implementuojama  bench.takeASeat() metodas
      //  bench.takeASeatSync();
        bench.takeASeatSyncBlock();
    }
}
