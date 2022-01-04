import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();
        List<String> firstItems = Arrays.stream(one.split(" ")).collect(Collectors.toList());
        List<String> secondItems = Arrays.stream(two.split(" ")).collect(Collectors.toList());

        List<Integer> first = new ArrayList<>();
        for (int i = 0; i < firstItems.size(); i++) {
            first.add(Integer.parseInt(firstItems.get(i)));
        }

        List<Integer> second = new ArrayList<>();
        for (int j = 0; j < secondItems.size(); j++) {
            second.add(Integer.parseInt(secondItems.get(j)));
        }

        boolean isFirstEmpty = false;
        boolean isSecondEmpty = false;
        for (int i = 0; i < first.size(); i = 0) {
            for (int j = i; j < second.size(); j = i) {
                if (first.get(i) .equals(second.get(j))) {
                    first.remove(i);
                    second.remove(j);
                    i = i + 1;
                    break;
                }

                if (first.get(i) > second.get(j)) {
                    first.add(first.get(i));
                    first.add(second.get(j));
                    first.remove(i);
                    second.remove(j);
                    i = 0;

                    if (second.size() == 0) {
                        isSecondEmpty = true;
                        break;
                    }
                    break;

                }
                if (first.get(i) < second.get(j)) {
                    second.add(second.get(j));
                    second.add(first.get(i));
                    second.remove(j);
                    first.remove(i);
                    i = 0;
                    break;
                }
            }

            if (first.size() == 0) {
                isFirstEmpty = true;
                break;
            }

            if (isSecondEmpty) {
                break;
            }
        }

        if (isSecondEmpty) {
            int sumFirstPlayer = 0;
            for (int i = 0; i < first.size(); i++) {
                sumFirstPlayer += first.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sumFirstPlayer);
        }

        if (isFirstEmpty) {
            int sumSecondPlayer = 0;
            for (int i = 0; i < second.size(); i++) {
                sumSecondPlayer += second.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sumSecondPlayer);
        }


    }
}
