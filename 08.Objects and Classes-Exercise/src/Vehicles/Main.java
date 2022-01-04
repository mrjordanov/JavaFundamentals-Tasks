package Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();

        double sumHorsePowerCars = 0;
        double sumHorsePowerTrucks = 0;
        while (!input.equals("End")) {
            String[] info = input.split(" ");
            String type = info[0];
            String model = info[1];
            String color = info[2];
            int horsePower = Integer.parseInt(info[3]);

            if (type.equals("car")) {
                Car car = new Car(model, color, horsePower);
                sumHorsePowerCars += car.getHorsePower();
                cars.add(car);
            }

            if (type.equals("truck")) {
                Truck truck = new Truck(model, color, horsePower);
                sumHorsePowerTrucks += truck.getHorsePower();
                trucks.add(truck);
            }
            input = scanner.nextLine();
        }

        double avvHorsePowerOfCars=0;
        if (cars.size() == 0) {
            avvHorsePowerOfCars=0;
        }
        else {
            avvHorsePowerOfCars = sumHorsePowerCars / cars.size();
        }

        double totalHorsePowerForTrucks = 0;
        if (trucks.size() > 0) {
            totalHorsePowerForTrucks = sumHorsePowerTrucks / trucks.size();
        }
        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            for (Car car : cars) {
                if (car.getModel().equals(input)) {
                    System.out.println(car);
                    break;
                }
            }
            for (Truck truck : trucks) {
                if (truck.getModel().equals(input)) {
                    System.out.println(truck);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.", avvHorsePowerOfCars).println();
        System.out.printf("Trucks have average horsepower of: %.2f.", totalHorsePowerForTrucks);

    }
}
