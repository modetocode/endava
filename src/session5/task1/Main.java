package session5.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Vehicle[] vehicles = new Vehicle[100];
        int numberOfVehicles = 0;
        for (int i = 0; i < k; i++) {
            int commandNumber = scanner.nextInt();
            switch (commandNumber) {
                case 1:
                    vehicles[numberOfVehicles++] = new Car(
                            scanner.nextInt(),
                            scanner.nextBoolean(),
                            scanner.nextInt(),
                            scanner.nextInt());
                    break;
                case 2:
                    vehicles[numberOfVehicles++] = new Truck(
                            scanner.nextInt(),
                            scanner.nextBoolean(),
                            scanner.nextInt(),
                            scanner.nextFloat());
                    break;
                case 3:
                    for (int j = 0; j < numberOfVehicles; j++) {
                        System.out.println(vehicles[j].toString());
                    }
                    break;
                case 4:
                    int count = 0;
                    for (int j = 0; j < numberOfVehicles; j++) {
                        boolean isSafe = false;
//                        if (vehicles[j] instanceof Car) {
//                            Car car = (Car) vehicles[j];
//                            isSafe = car.getTopSpeed() < 200;
//                        } else if (vehicles[j] instanceof Truck) {
//                            Truck truck = (Truck) vehicles[j];
//                            isSafe = truck.getTrailerVolume() < 1000;
//                        }
//
//                        if (isSafe) {
//                            count++;
//                        }
                        if(vehicles[j].isSafe()) {
                            count++;
                        }

                    }

                    System.out.println(count);
                    break;
            }
        }
    }
}
