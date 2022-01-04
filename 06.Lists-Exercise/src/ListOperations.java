import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> str = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            numbers.add(Integer.parseInt(str.get(i)));
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] num = command.split(" ");

            if (num[0].equals("Add")) {
                int arg = Integer.parseInt(num[1]);
                numbers.add(arg);
            }

            if (num[0].equals("Insert")) {
                int firstArg = Integer.parseInt(num[1]);
                int secondArg = Integer.parseInt(num[2]);
                if (secondArg >= 0 && secondArg < numbers.size()) {
                    numbers.add(secondArg, firstArg);
                } else {
                    System.out.println("Invalid index");
                }

            }

            if (num[0].equals("Remove")) {
                int arg = Integer.parseInt(num[1]);
                if (arg >= 0 && arg < numbers.size()) {
                    numbers.remove(arg);
                } else {
                    System.out.println("Invalid index");
                }

            }

            if (num[0].equals("Shift")) {
                int arg = Integer.parseInt(num[2]);
                if (num[1].equals("left")) {
                    for (int j = 1; j <= arg; j++) {
                        int curNum = numbers.get(0);
                        for (int i = 0; i < numbers.size() - 1; i++) {
                            numbers.set(i, numbers.get(i + 1));
                        }
                        numbers.set(numbers.size() - 1, curNum);

                    }
                }
                if (num[1].equals("right")) {
                    for (int j = 1; j <= arg; j++) {
                        int curNum = numbers.get(numbers.size() - 1);
                        for (int i = numbers.size() - 1; i > 0; i--) {
                            numbers.set(i, numbers.get(i - 1));
                        }
                        numbers.set(0, curNum);

                    }
                }
            }

            command = scanner.nextLine();
        }
        for (int n : numbers) {
            System.out.printf("%d ", n);
        }

    }
}