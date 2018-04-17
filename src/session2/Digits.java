package session2;

public class Digits {
    public static void main(String[] args) {
        // write your code here

        int number = 123456;
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            number = number / 10;
        }
    }

    public boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
//                return false;
            }
        }

//        return true;
        return isPrime;
    }
}
