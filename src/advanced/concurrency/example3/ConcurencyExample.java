package advanced.concurrency.example3;

public class ConcurencyExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts!");
        StopWatch sw1 = new StopWatch("SW1"); // StopWatch klases pirmas objektas
        StopWatch sw2 = new StopWatch("SW2"); // StopWatch klases antras objektas

        sw1.start();
        try{
            Thread.sleep(1000);
            sw2.start();
            System.out.println("Main trhead is still running");
            Thread.sleep(3000);
            System.out.println("Main trhead edns :/");
        }catch (InterruptedException e){
            System.out.println("Thread was interrupted on sleep");

        }

    }
}
