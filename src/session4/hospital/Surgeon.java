package session4.hospital;

public class Surgeon extends Doctor {

    public void makeIncision() {
        System.out.println("Performing operation");
    }

    @Override
    public void treatPatient() {
        System.out.println("Surgeon treating patient");
    }
}
