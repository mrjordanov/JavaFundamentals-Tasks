import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTaskV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();
        Map<String, Integer> items = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            items.putIfAbsent(resource, 0);
            int newCount = items.get(resource) + quantity;
            items.put(resource, newCount);

            resource = scanner.nextLine();
        }

        //Така принтираме по реда на въвеждане, защото е LinkedHashMap
        items.forEach((k,v)-> System.out.printf("%s -> %d",k,v).println());

        //Така принтираме сортирани по азбучен ред във възходящ ред, ако искам обратното разменям s1 i s2
        items.entrySet().stream().sorted((s1,s2)-> s1.getKey().compareTo(s2.getKey()))
                .forEach(s -> System.out.printf("%s -> %d",s.getKey(),s.getValue()).println());

        //Така принтираме всяка двойка сортирана по брой, по възходящ ред:
        items.entrySet().stream().sorted((s1,s2)-> s1.getValue().compareTo(s2.getValue()))
                .forEach(s -> System.out.printf("%s -> %d",s.getKey(),s.getValue()).println());

    }
}
