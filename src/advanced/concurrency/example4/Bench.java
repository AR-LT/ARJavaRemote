package advanced.concurrency.example4;

public class Bench {
    private int availableSeats; // atributas

    public Bench(int availableSeats) {  // konstruktorius
        this.availableSeats = availableSeats;
    }

    public void takeASeat() { // netinamas tikrinimas nes neprognozuojamas atsakymas
        if (availableSeats > 0) {
            System.out.println("Take a seat");
            availableSeats--; // sumaziname vienetu
            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println("There are no seats available ");
        }
    }

    public synchronized void takeASeatSync() {
        if (availableSeats > 0) {
            System.out.println("Take a seat");
            availableSeats--; // sumaziname vienetu
            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println("There are no seats available ");
        }
    }
    public void takeASeatSyncBlock() { // Sinkronizuojam tam tikra metodo vieta
        System.out.println("Unsynced part!");
        synchronized (this) {
            if (availableSeats > 0) { // sinkronizavom savo salygos koda, this ateina is konstruktoriaus
                System.out.println("Take a seat");
                availableSeats--; // sumaziname vienetu
                System.out.println("Available seats: " + availableSeats);
            } else {
                System.out.println("There are no seats available ");
            }
        }
    }
}