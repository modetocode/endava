package session4.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Car[] cars = new Car[100];
        Truck[] trucks = new Truck[100];
        int numberOfCars = 0;
        int numberOfTrucks = 0;
        for (int i = 0; i < k; i++) {
            int commandNumber = scanner.nextInt();
            switch (commandNumber) {
                case 1:
                    cars[numberOfCars++] = new Car(
                            scanner.nextInt(),
                            scanner.nextBoolean(),
                            scanner.nextInt(),
                            scanner.nextInt());
                    break;
                case 2:
                    trucks[numberOfTrucks++] = new Truck(
                            scanner.nextInt(),
                            scanner.nextBoolean(),
                            scanner.nextInt(),
                            scanner.nextFloat());
                    break;
                case 3:
                    for (int j = 0; j < numberOfCars; j++) {
                        System.out.println(cars[j].toString());
                    }
                    break;
                case 4:
                    for (int j = 0; j < numberOfTrucks; j++) {
                        System.out.println(trucks[j].toString());
                    }
                    break;
                case 5:
                    int counter = 0;
                    for (int j = 0; j < numberOfCars; j++) {
                        counter += cars[j].getTopSpeed() > 200 ?  1 : 0;

//                        Solution II
//                        if (cars[j].getTopSpeed() > 200) {
//                            counter++;
//                        }
                    }

                    System.out.println(counter);
                    break;
            }
        }
    }
}
