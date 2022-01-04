package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        double sumHorsePowerCars = 0;
        double sumHorsePowerTrucks = 0;
        while (!input.equals("End")) {
            String[] info = input.split(" ");
            String type = info[0];
            String model = info[1];
            String color = info[2];
            int horsePower = Integer.parseInt(info[3]);

            if (type.equals("car")) {
                Vehicle car = new Vehicle(model, color, horsePower);
                sumHorsePowerCars += car.getHorsePower();
                cars.add(car);
            }

            if (type.equals("truck")) {
                Vehicle truck = new Vehicle(model, color, horsePower);
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
            for (Vehicle car : cars) {
                if (input.equals(car.getModel())) {
                    System.out.println("Type: Car");
                    System.out.printf("Model: %s",car.getModel()).println();
                    System.out.printf("Color: %s",car.getColor()).println();
                    System.out.printf("Horsepower: %d",car.getHorsePower()).println();
                }

            }
            for (Vehicle truck : trucks) {
                if (input.equals(truck.getModel())) {
                    System.out.println("Type: Truck");
                    System.out.printf("Model: %s",truck.getModel()).println();
                    System.out.printf("Color: %s",truck.getColor()).println();
                    System.out.printf("Horsepower: %d",truck.getHorsePower()).println();
                }
            }
            input= scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.",avvHorsePowerOfCars).println();
        System.out.printf("Trucks have average horsepower of: %.2f.",totalHorsePowerForTrucks);

    }
}
