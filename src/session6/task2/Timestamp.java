package session6.task2;

public class Timestamp implements Comparable<Timestamp> {

    private int hour;
    private int minute;

    public Timestamp(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public int compareTo(Timestamp o) {
        if (Integer.compare(hour, o.hour) == 0) {
            return Integer.compare(minute, o.minute);
        }

        return Integer.compare(hour, o.hour);
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }
}
