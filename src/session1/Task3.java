package session1;

public class Task3 {

    public static void main(String[] args) {
        int number = 80;
        int number2 = 120;
        int number3 = 80;
        int number4 = 200;
        int number5 = 230;
        int startRange = 100;
        int endRange = 200;
        isInRange(number, startRange, endRange);
        boolean isInRange2= isInRange(number2, startRange, endRange);
        boolean isInRange3 = isInRange(number3, startRange, endRange);
        boolean isInRange4 = isInRange(number4, startRange, endRange);
        boolean isInRange5 = isInRange(number5, startRange, endRange);
//        System.out.println(isInRange);
        System.out.println(isInRange2);
        System.out.println(isInRange3);
        System.out.println(isInRange4);
        System.out.println(isInRange5);
    }

    public static boolean isInRange(int number, int startRange, int endRange) {
        boolean isInRange = number >= startRange && number <= endRange;
        return isInRange;
    }
}
