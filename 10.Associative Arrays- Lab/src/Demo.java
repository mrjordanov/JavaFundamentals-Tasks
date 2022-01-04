import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> phoneBook = new LinkedHashMap<>();


        phoneBook.put("Pesho", 1235);
        phoneBook.put("Pesho1", 1235);
        phoneBook.put("Gosho", 1235);
        phoneBook.put("Pesho2", 1235);
        phoneBook.put("Pesho3", 1235);
        phoneBook.put("Pepi", 1235);

        phoneBook.remove("Pesho2");
        Integer gosho = phoneBook.get("Gosho");

        phoneBook.entrySet()
                .stream()
                .sorted((l,r)-> {
                    int left=l.getKey().length();
                    int right=r.getKey().length();
                    return left-right;
                })
                .collect(Collectors.toList());


       // phoneBook.containsKey("Pesho1");
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }




        List<String> numbers=Arrays.asList("1","2","3","4","5");
        List<Integer> collect=numbers.stream()
                .map(n->Integer.parseInt(n))
                .map(n->n+2)
                .filter(n-> n>4)
        .collect(Collectors.toList());
        System.out.println(collect);
    }
}
