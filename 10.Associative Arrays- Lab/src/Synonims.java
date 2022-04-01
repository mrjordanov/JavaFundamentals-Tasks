import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Synonims {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> map = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            map.putIfAbsent(word, new ArrayList<>());
            map.get(word).add(synonym);
        }

        map.forEach((key, value) -> System.out.printf("%s - %s", key, String.join(", ", value)).println());

    }
}
