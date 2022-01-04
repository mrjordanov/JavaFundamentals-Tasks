import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        List<String> str = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> initialDrums = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            initialDrums.add(Integer.parseInt(str.get(i)));
        }

        List<Integer> drums = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            drums.add(Integer.parseInt(str.get(i)));
        }

        String command = scanner.nextLine();

        while (!command.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(command);

            for (int i = 0; i < drums.size(); i++) {
                drums.set(i, drums.get(i) - hitPower);

                if (drums.get(i) <= 0) {
                    if (savings - 3 * initialDrums.get(i) >= 0) {
                        drums.set(i, initialDrums.get(i));
                        savings -= 3 * initialDrums.get(i);
                    } else {
                        drums.remove(i);
                        initialDrums.remove(i);
                        if (drums.size() == 0) {
                            break;
                        }
                        if (i == drums.get(drums.size() - 1)) {
                            i = 0;
                        } else {
                            i = i - 1;
                        }
                    }
                }

            }
            command = scanner.nextLine();
        }

        if (drums.size() == 0) {
            System.out.println();
        } else {
            for (int i = 0; i < drums.size(); i++) {
                System.out.printf("%d ", drums.get(i));
            }
            System.out.println();

        }
        System.out.printf("Gabsy has %.2flv.", savings);


    }
}
