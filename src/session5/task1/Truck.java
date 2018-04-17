package session5.task1;

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

    @Override
    public boolean isSafe() {
        return trailerVolume < 1000;
    }

    public float getTrailerVolume() {
        return trailerVolume;
    }
}
