import java.util.*;


public class OddOccur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] arr = input.toLowerCase().split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            }else {
                map.put(word,1);
            }

        }

        List<String> list = new ArrayList<>();
        map.entrySet().stream().filter(e -> e.getValue() % 2 == 1).forEach(e -> list.add(e.getKey()));
        System.out.println(String.join(", ", list));
    }
}
