import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbersV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String bum = scanner.nextLine();
        String[] bomber = bum.split(" ");

        List<String> str = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            numbers.add(Integer.parseInt(str.get(i)));
        }

        int bomb = Integer.parseInt(bomber[0]);
        int power = Integer.parseInt(bomber[1]);

        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);
            int leftBound = Math.max(index - power, 0);
            int rightBound = Math.min(index + power, numbers.size() - 1);
            for (int i = rightBound; i >= leftBound; i--) {
                numbers.remove(i);
            }
        }
        int sum = sumList(numbers);
        System.out.print(sum);

    }

    private static int sumList(List<Integer> numbers) {
        int result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
        }
        return result;
    }
}
