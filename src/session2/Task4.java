package session2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char character = 'o';
        int size = string.length();
        int i = 0;
        int numberOfOccurences = 0;
        while(i < size) {
            char currentCharacter = string.charAt(i);
            if (currentCharacter == character) {
                numberOfOccurences++;
            }

            i++;
        }

        System.out.println(numberOfOccurences);
    }
}
