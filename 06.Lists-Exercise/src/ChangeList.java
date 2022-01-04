import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
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
            String[] task = command.split(" ");

            if (task[0].equals("Delete")) {
                int argument = Integer.parseInt(task[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (argument == numbers.get(i)) {
                        numbers.remove(i);
                        i = i - 1;
                    }
                }
                //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
            }

            if (task[0].equals("Insert")) {
                int element = Integer.parseInt(task[1]);
                int position = Integer.parseInt(task[2]);
                numbers.add(position,element);
               //System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
            }

            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
