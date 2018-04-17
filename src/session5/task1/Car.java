package session5.task1;

public class Car extends Vehicle {

    private int topSpeed;

    public Car(int wheelNumber, boolean isAutomatic, int doorNumber, int topSpeed) {
        super(wheelNumber, isAutomatic, doorNumber);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", TopSpeed: " + topSpeed;
    }

    @Override
    public boolean isSafe() {
        return topSpeed < 200;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
