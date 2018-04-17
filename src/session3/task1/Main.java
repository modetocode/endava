package session3.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee;
        for (int i = 0; i < 2; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            employee = new Employee(name, age);
            System.out.println(employee.toString());
        }
    }
}
