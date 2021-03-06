package advanced.concurrency.example1;

public class ConcurencyExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts!");
        try{
            Thread.sleep(2000);
            System.out.println("Main trhead is still running");
            Thread.sleep(5000);
            System.out.println("Main trhead edns :/");
        }catch (InterruptedException e){
            System.out.println("Thread was interrupted on sleep");

        }

    }
}
