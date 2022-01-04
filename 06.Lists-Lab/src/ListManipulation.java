import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        List<String> items = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            numbers.add(Integer.parseInt(items.get(i)));
        }


        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            int argument = Integer.parseInt(commandParts[1]);

            switch (commandName) {
                case "Add":
                    numbers.add(argument);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(argument));
                    break;
                case "RemoveAt":
                    numbers.remove(argument);
                    break;
                case "Insert":
                    int nextArgument = Integer.parseInt(commandParts[2]);
                    numbers.add(nextArgument, argument);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.print(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
