package session3.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Employee[] employee = new Employee[10000];
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            employee[i] = new Employee(name, age);
        }

        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            int commandNumber = scanner.nextInt();
            switch (commandNumber) {
                case 1: {
                    String name = scanner.next();
                    int age = scanner.nextInt();
                    employee[n] = new Employee(name, age);
                    n++;
                    break;
                }
                case 2: {
                    String name = scanner.next();
                    employee[n] = new Employee(name);
                    n++;
                    break;
                }
                case 3:
                    for (int j = 0; j < n; j++) {
                        System.out.println(employee[j].toString());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
