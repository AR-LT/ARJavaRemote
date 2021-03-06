package advanced.concurrency.example3;

public class StopWatch extends  Thread{
    // paveldime Tread kalse
private String threndName; // atributas

    public StopWatch(String  threndName) { // konstruktorius
        this.threndName = threndName;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(threndName +" " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
