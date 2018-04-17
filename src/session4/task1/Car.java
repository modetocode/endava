package session4.task1;

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

    public int getTopSpeed() {
        return topSpeed;
    }
}
