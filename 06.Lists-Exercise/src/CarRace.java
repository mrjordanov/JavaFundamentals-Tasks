import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> str = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> race = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            race.add(Integer.parseInt(str.get(i)));
        }

        double timeForLeftRacer = 0;
        for (int i = 0; i < race.size() / 2; i++) {
            if (race.get(i) == 0) {
                timeForLeftRacer = 0.8 * timeForLeftRacer;
                continue;
            }
            timeForLeftRacer += race.get(i);
        }

        double timeForTightRacer = 0;
        for (int i = race.size() - 1; i >= (race.size() / 2) + 1; i--) {
            if (race.get(i) == 0) {
                timeForTightRacer = 0.8 * timeForTightRacer;
                continue;
            }
            timeForTightRacer += race.get(i);
        }

        if (timeForLeftRacer < timeForTightRacer) {
            System.out.printf("The winner is left with total time: %.1f", timeForLeftRacer);
        } else {
            System.out.printf("The winner is right with total time: %.1f", timeForTightRacer);
        }


    }
}
