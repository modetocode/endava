package session4.hospital;

import session4.hospital.Doctor;

public class FamilyDoctor extends Doctor {

    private boolean makesHouseCalls;

    public void giveAdvice() {
        System.out.println("Take vitamin C");
    }

    public boolean makesHouseCalls() {
        return makesHouseCalls;
    }

    public void setMakesHouseCalls(boolean makesHouseCalls) {
        this.makesHouseCalls = makesHouseCalls;
    }
}
