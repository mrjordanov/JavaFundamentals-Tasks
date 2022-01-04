import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> strings = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            numbers.add(Integer.parseInt(strings.get(i)));
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] com = command.split(" ");
            String task = com[0];


            if (task.equals("Contains")) {
                int argument = Integer.parseInt(com[1]);
                boolean isFound = false;
                int index = 0;
                for (int i = 0; i < numbers.size(); i++) {
                    if (argument == numbers.get(i)) {
                        isFound = true;
                    }
                }
                if (isFound) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            }

            if (task.equals("Print")) {
                String argument = com[1];
                if (argument.equals("even")) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 == 0) {
                            System.out.printf("%d ", numbers.get(i));
                        }
                    }
                    System.out.println();
                }
                if (argument.equals("odd")) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) % 2 != 0) {
                            System.out.printf("%d ", numbers.get(i));
                        }
                    }
                    System.out.println();
                }
            }

            if (task.equals("Get")) {
                String argument = com[1];
                if (argument.equals("sum")) {
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                }
            }

            if (task.equals("Filter")) {
                String argument = com[1];
                String lastArg = com[2];
                int number = Integer.parseInt(lastArg);
                if (argument.compareTo(">") == 0) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) > number) {
                            System.out.printf("%d ", numbers.get(i));
                        }
                    }
                    System.out.println();
                }
                if (argument.compareTo("<") == 0) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) < number) {
                            System.out.printf("%d ", numbers.get(i));
                        }
                    }
                    System.out.println();
                }
                if (argument.compareTo(">=") == 0) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) >= number) {
                            System.out.printf("%d ", numbers.get(i));
                        }
                    }
                    System.out.println();
                }
                if (argument.compareTo("<=") == 0) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) <= number) {
                            System.out.printf("%d ", numbers.get(i));
                        }
                    }
                    System.out.println();
                }
            }


            command = scanner.nextLine();
        }

    }
}
