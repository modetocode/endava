package session2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("Winter is here");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Spring");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Summer");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Autumn");
        }
    }
}
