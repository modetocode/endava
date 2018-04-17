package session4.hospital;

public class Hospital {

    public static void main(String[] args) {
        FamilyDoctor familyDoctor = new FamilyDoctor();
        familyDoctor.setMakesHouseCalls(true);
        if (familyDoctor.makesHouseCalls()) {
            familyDoctor.giveAdvice();
        }

        Surgeon surgeon = new Surgeon();
        surgeon.setWorksAtHospital(true);
        if (surgeon.worksAtHospital()) {
            surgeon.makeIncision();
            surgeon.treatPatient();
        }
    }
}
