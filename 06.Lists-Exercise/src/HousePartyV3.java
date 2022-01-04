import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HousePartyV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+", 2);
            String name = tokens[0];
            if (tokens[1].equals("is going!")) {
                if (list.contains(name)) {
                    System.out.printf("%s is already in list", name);
                } else {
                    list.add(name);
                }
            } else if (tokens[1].equals("not going!")) {
                if (list.contains(name)) {
                    list.remove(name);
                } else {
                    System.out.printf("%s is not in the list!", name);
                }
            }

        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
