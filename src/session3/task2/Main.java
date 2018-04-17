package session3.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Employee[] employee = new Employee[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            employee[i] = new Employee(name, age);
            System.out.println(employee[i].toString());
        }
    }
}
