
import java.util.*;

public class Cours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String courseName = input.split(":")[0];
            String studentName = input.split(":")[1];

            courses.putIfAbsent(courseName, new ArrayList<>());
            courses.get(courseName);

            input = scanner.nextLine();
        }

        courses.entrySet()
                .stream()
                .sorted((s1, s2) -> Integer.compare(s2.getValue().size(), s1.getValue().size()))
                .forEach(c -> {
                    System.out.printf("%s: %d", c.getKey(), c.getValue().size()).println();
                    c.getValue().stream().sorted((u1, u2) -> u1.compareTo(u2)).forEach(v -> System.out.printf("--%s", v).println());
                });


    }
}
