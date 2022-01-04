import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            names.add(input);
        }

        Collections.sort(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%d.%s", i + 1, names.get(i)).println();
        }


    }
}
