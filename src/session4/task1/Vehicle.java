package session4.task1;

public class Vehicle {

    protected int wheelNumber;
    protected boolean isAutomatic;
    protected int doorNumber;

    public Vehicle(int wheelNumber, boolean isAutomatic, int doorNumber) {
        this.wheelNumber = wheelNumber;
        this.isAutomatic = isAutomatic;
        this.doorNumber = doorNumber;
    }

    public String toString() {
        String typeOfTransmission;
        typeOfTransmission = isAutomatic ? "Automatic" : "Manual";
        return "Wheels: " + wheelNumber + ", Transmission: " + typeOfTransmission + ", Doors: " + doorNumber;
    }
}
