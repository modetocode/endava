package session6.task2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Timestamp> timestamps = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String timestamp = scanner.next();
            String[] parts = timestamp.split(":");
            timestamps.add(new Timestamp(Integer.parseInt(parts[0]), Integer.parseInt(parts[1])));
        }

        for (Timestamp timestamp : timestamps) {
            System.out.println(timestamp.toString());
        }

    }
}
