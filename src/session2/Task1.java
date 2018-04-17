package session2;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ((number % 2) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
