package advanced.polymorphism;

public class TvRemoteController implements RemoteController {
    @Override
    public void enable(boolean action) {
        if(action) {
            System.out.println("Turning Tv on");
        } else {
            System.out.println("Turning Tv off");
        }
    }
}
