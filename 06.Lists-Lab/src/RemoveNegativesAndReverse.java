
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> items = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {
            list.add(Integer.parseInt(items.get(i)));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i = i - 1;
            }
        }

        Collections.reverse(list);
        if (list.size() > 0) {
            System.out.print(list.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.print("empty");
        }


    }
}
