package VechicleCatalogueV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Car> carList = new ArrayList<>();
        List<Truck> truckList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] info = input.split(" ");
            String type = info[0];
            String model = info[1];
            String color = info[2];
            int horsePower = Integer.parseInt(info[3]);

            if (info[0].equals("car")) {
                Car car = new Car(model, color, horsePower);
                carList.add(car);
            }
            if (info[0].equals("truck")) {
                Truck truck = new Truck(model, color, horsePower);
                truckList.add(truck);
            }

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")) {
            for (Car car : carList) {
                if (car.getModel().equals(command)) {
                    System.out.print(car);
                }
            }
            for (Truck truck : truckList) {
                if (truck.getModel().equals(command)) {
                    System.out.print(truck);
                }
            }
            command = scanner.nextLine();
        }


        double avvHorsePowerCars = carList.stream().mapToDouble(e -> e.getHorsepower()).average().orElse(0.00);
        if (avvHorsePowerCars == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.", avvHorsePowerCars).println();
        }

        double avvHorsePowerTrucks = truckList.stream().mapToDouble(e -> e.getHorsepower()).average().orElse(0.00);
        if (avvHorsePowerTrucks == 0) {
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.", avvHorsePowerTrucks).println();
        }

    }
}