import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> occurrences = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char a = ' ';
            char cur = input.charAt(i);
            if (cur != a) {
                occurrences.putIfAbsent(cur,0);
                int count=occurrences.get(cur)+1;
                occurrences.put(cur,count);
                }
            }

    for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%c -> %d", entry.getKey(), entry.getValue()).println();
        }
    }
}
