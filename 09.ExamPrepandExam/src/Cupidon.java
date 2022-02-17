import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cupidon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        int curIndex = 0;
        while (!command.equals("Love!")) {
            int lengthOfJump = Integer.parseInt(command.split(" ")[1]);

            if (curIndex + lengthOfJump >= houses.size()) {
                curIndex = 0;
                if (houses.get(curIndex) == 0) {
                    System.out.println("Place " + curIndex + " already had Valentine's day.");
                    command = scanner.nextLine();
                    continue;
                } else {
                    int value = houses.get(curIndex);
                    houses.set(curIndex, value - 2);
                    if (houses.get(curIndex) == 0) {
                        System.out.println("Place " + curIndex + " has Valentine's day.");
                        command = scanner.nextLine();
                        continue;
                    }
                }

            } else {
                curIndex = curIndex + lengthOfJump;
                if (houses.get(curIndex) == 0) {
                    System.out.println("Place " + curIndex + " already had Valentine's day.");
                    command = scanner.nextLine();
                    continue;
                }
            }
            int value = houses.get(curIndex);
            houses.set(curIndex, value - 2);
            if (houses.get(curIndex) == 0) {
                System.out.println("Place " + curIndex + " has Valentine's day.");
            }

            command = scanner.nextLine();
        }

        System.out.println("Cupid's last position was " + curIndex + ".");

        int count = 0;
        for (int house : houses) {
            if (house != 0) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Cupid has failed " + count + " places.");
        } else {
            System.out.println("Mission was successful.");
        }

    }
}
