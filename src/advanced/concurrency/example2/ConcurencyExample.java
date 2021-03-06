package advanced.concurrency.example2;

public class ConcurencyExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts!");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
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
