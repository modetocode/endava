package session4.hospital;

public class Doctor {

    private boolean worksAtHospital;

    public void treatPatient() {
        System.out.println("Treat the patient");
    }

    public boolean worksAtHospital() {
        return worksAtHospital;
    }

    public void setWorksAtHospital(boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }
}
