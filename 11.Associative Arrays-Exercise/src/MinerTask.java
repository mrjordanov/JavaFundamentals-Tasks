import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();
        Map<String, Integer> items = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (items.containsKey(resource)) {
                Integer count = items.get(resource);
                items.put(resource,count+quantity);
            } else {
                items.put(resource, quantity);
            }
            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.printf("%s -> %d",entry.getKey(),entry.getValue()).println();
        }
    }
}
