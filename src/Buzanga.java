public class Buzanga implements Bicycle {
    private int speed = 0;

    public int getSpeed() {
        return speed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed = (speed - decrement) > 0 ? speed-decrement : speed;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }
}
