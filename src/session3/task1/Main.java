package session3.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee;
        for (int j = 0; j < 2; j++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            employee = new Employee(name, age);
            employee.setSurname("Endava");
            System.out.println(employee.toString());
        }
    }
}
