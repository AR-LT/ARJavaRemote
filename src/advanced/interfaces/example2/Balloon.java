package advanced.interfaces.example2;

import java.util.Random;

public class Balloon extends AirTransport implements Fly{

    public Balloon(int speed) {
        super(speed);
    }

    @Override
    public int cakculateMaxSpeed() {
        Random random = new Random();
        return 100/speed* random.nextInt(100);
    }

    @Override
    public boolean canFly(String condition) {
        return condition.equals("good");
    }
}
