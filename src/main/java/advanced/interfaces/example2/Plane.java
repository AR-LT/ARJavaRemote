package advanced.interfaces.example2;

public class Plane extends AirTransport implements Fly{
// pevaldim is tevines klases
    public Plane(int speed) {
        super(speed);
    }

    @Override
    public int cakculateMaxSpeed() {
        return speed + 50;
    }

    @Override
    public boolean canFly(String condition) {
        return true;
    }
}

