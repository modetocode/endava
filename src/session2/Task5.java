package session2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (i >= 3) {
                break;
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

        }

        System.out.println((max - min));
    }
}
