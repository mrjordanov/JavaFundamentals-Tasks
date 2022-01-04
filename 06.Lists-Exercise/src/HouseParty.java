import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> questList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] names = command.split("\\s+", 2);
            String name = names[0];

            if (names[1].equals("is going!")) {
                if (questList.contains(name)) {
                    System.out.printf("%s is already in the list!", name).println();
                } else {
                    questList.add(name);
                }

            } else if (names[1].equals("is not going!")) {
                if (questList.contains(name)) {
                    questList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!", name).println();
                }
            }
        }

        for (String s:questList) {
            System.out.println(s);
        }
    }
}

