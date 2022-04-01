import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Map<String, Integer> mileAgeMap = new LinkedHashMap<>();
        Map<String, Integer> fuelMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String carInformation = scanner.nextLine();
            String carModel = carInformation.split("\\|")[0];
            int mileAge = Integer.parseInt(carInformation.split("\\|")[1]);
            int fuel = Integer.parseInt(carInformation.split("\\|")[2]);

            mileAgeMap.put(carModel, mileAge);
            fuelMap.put(carModel, fuel);
        }

        String arg = scanner.nextLine();

        while (!arg.equals("Stop")) {
            String command = arg.split(" : ")[0];
            String carModel = arg.split(" : ")[1];

            if (command.equals("Drive")) {
                int distanceToDrive = Integer.parseInt(arg.split(" : ")[2]);
                int fuelForDistance = Integer.parseInt(arg.split(" : ")[3]);
                if (fuelMap.get(carModel) < fuelForDistance) {
                    System.out.println("Not enough fuel to make that ride");
                    arg = scanner.nextLine();
                    continue;
                }
                fuelMap.put(carModel, fuelMap.get(carModel) - fuelForDistance);
                mileAgeMap.put(carModel, mileAgeMap.get(carModel) + distanceToDrive);
                System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.", carModel, distanceToDrive, fuelForDistance).println();
                if (mileAgeMap.get(carModel) >= 100000) {
                    mileAgeMap.remove(carModel);
                    fuelMap.remove(carModel);
                    System.out.printf("Time to sell the %s!", carModel).println();
                }
            }

            if (command.equals("Refuel")) {
                int refuel = Integer.parseInt(arg.split(" : ")[2]);
                int curFuelInCar = fuelMap.get(carModel);
                if (curFuelInCar + refuel > 75) {
                    fuelMap.put(carModel, 75);
                    int diff = 75 - curFuelInCar;
                    System.out.printf("Car refueled with %d liters", diff).println();
                } else {
                    fuelMap.put(carModel, curFuelInCar + refuel);
                    System.out.printf("Car refueled with %d liters", refuel).println();
                }
            }

            if (command.equals("Revert")) {
                int kilometersToRevert = Integer.parseInt(arg.split(" : ")[2]);
                int mileAgeOfCar = mileAgeMap.get(carModel);
                if(mileAgeOfCar-kilometersToRevert<10000){
                    mileAgeMap.put(carModel,10000);
                    arg= scanner.nextLine();
                    continue;
                }else {
                    mileAgeMap.put(carModel,mileAgeOfCar-kilometersToRevert);
                    System.out.printf("%s mileage decreased by %d kilometers",carModel,kilometersToRevert).println();
                }

            }


            arg = scanner.nextLine();
        }

        mileAgeMap.entrySet()
                .forEach(c-> System.out.printf("%s -> Mileage: %d, Fuel in the tank: %d lt.",c.getKey(),c.getValue(),fuelMap.get(c.getKey())).println());



    }
}
