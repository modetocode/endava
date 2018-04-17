package session4.task1;

public class Truck extends Vehicle {

    private float trailerVolume;

    public Truck(int wheelNumber, boolean isAutomatic, int doorNumber, float trailerVolume) {
        super(wheelNumber, isAutomatic, doorNumber);
        this.trailerVolume = trailerVolume;
    }

    @Override
    public String toString() {
        return super.toString() + ", TrailerVolume: " + trailerVolume;
    }
}
