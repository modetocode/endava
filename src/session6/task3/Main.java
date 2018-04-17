package session6.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> numberToCountMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (!numberToCountMap.containsKey(number)) {
                numberToCountMap.put(number, 0);
            }

            numberToCountMap.put(number, numberToCountMap.get(number) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numberToCountMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            if (count == 2) {
                System.out.print(number + " ");
            }
        }

        System.out.println();

    }
}
