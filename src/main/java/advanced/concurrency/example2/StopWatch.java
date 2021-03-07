package advanced.concurrency.example2;

public class StopWatch extends  Thread{
    // paveldime Tread kalse

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Stop watch: " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
