import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxCapacityForWagon = Integer.parseInt(scanner.nextLine());
        List<String> items = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            numbers.add(Integer.parseInt(items.get(i)));
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] task = command.split(" ");

            if (task[0].equals("Add")) {
                int argument = Integer.parseInt(task[1]);
                numbers.add(argument);

            } else {
                int argument = Integer.parseInt(task[0]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (argument + numbers.get(i) <= maxCapacityForWagon) {
                        numbers.set(i, argument + numbers.get(i));
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.print(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
