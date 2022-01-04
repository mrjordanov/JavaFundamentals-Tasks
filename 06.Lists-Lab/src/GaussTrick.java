import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> str = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            numbers.add(Integer.parseInt(str.get(i)));
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                break;
            }
            int first = (numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.set(i, first);
            numbers.remove(numbers.size() - 1);
        }

        for (int j = 0; j < numbers.size(); j++) {
            System.out.printf("%d ", numbers.get(j));
        }
    }
}
