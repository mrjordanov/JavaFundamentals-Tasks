import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String message = scanner.nextLine();
        List<String> items = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<String> strings = Arrays.stream(message.split("")).collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();
        String last = "";
        for (int i = 0; i < items.size(); i++) {
            numbers.add(Integer.parseInt(items.get(i)));

            int sumOfDigits = 0;
            int curNum = numbers.get(i);
            while (curNum > 0) {
                sumOfDigits += curNum % 10;
                curNum = curNum / 10;
            }
            if (sumOfDigits > strings.size()) {
                sumOfDigits = sumOfDigits - strings.size();
            }

            for (int j = 0; j < strings.size(); j++) {
                if (j == sumOfDigits) {
                    last += strings.get(j);
                    strings.remove(j);
                    break;
                }
            }
        }

        System.out.println(last);
    }
}
