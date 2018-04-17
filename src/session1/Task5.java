package session1;

public class Task5 {
    public static void main(String[] args) {
        int number = 80;
        int number2 = 120;
        int number3 = 80;
        int number4 = 200;
        int number5 = 230;
        int startRange = 100;
        int endRange = 200;
        boolean isInRange = isInRange(number, startRange, endRange)
                &&
                isInRange(number2, startRange, endRange)
                &&
                isInRange(number3, startRange, endRange)
                &&
                isInRange(number4, startRange, endRange)
                &&
                isInRange(number5, startRange, endRange);
//        System.out.println(isInRange);
        System.out.println(isInRange);
    }

    public static boolean isInRange(int number, int startRange, int endRange) {
        boolean isInRange = number >= startRange && number <= endRange;
        return isInRange;
    }
}
