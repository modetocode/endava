package session2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2: {
                System.out.println("Winter is here");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Spring");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Summer");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Autumn");
                break;
            }
            default: {
                System.out.println("Wrong month number");
            }
        }
    }
}
