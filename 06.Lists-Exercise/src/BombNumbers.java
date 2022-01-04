import java.util.*;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String bomb = scanner.nextLine();
        String[] bomber = bomb.split(" ");

        List<String> str = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            numbers.add(Integer.parseInt(str.get(i)));
        }

        int specialNumber = Integer.parseInt(bomber[0]);
        int power = Integer.parseInt(bomber[1]);

        for (int i = 0; i < numbers.size(); i++) {
            if (specialNumber == numbers.get(i)) {
                for (int j = 0; j < power; j++) {
                    if (i - 1 < 0) {
                        break;
                    } else {
                        numbers.remove(i - 1);
                    }
                    i = i - 1;
                }

                for (int j = 0; j < power; j++) {
                    if (i + 1 > numbers.size() - 1) {
                        break;
                    } else {
                        numbers.remove(i + 1);
                    }
                }
                numbers.remove(i);
            }
        }
        int sum = 0;
        for (int j = 0; j < numbers.size(); j++) {
            sum += numbers.get(j);
        }
        System.out.print(sum);
    }
}
