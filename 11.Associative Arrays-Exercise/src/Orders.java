import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Double> items = new LinkedHashMap<>();
        Map<String, Integer> quantities = new LinkedHashMap<>();


        while (!input.equals("buy")) {

            String[] command = input.split(" ");
            String product = command[0];
            double price = Double.parseDouble(command[1]);
            int quantity = Integer.parseInt(command[2]);

            items.put(product, price);

            quantities.putIfAbsent(product, 0);
            int newCount = quantities.get(product) + quantity;
            quantities.put(product, newCount);

            input = scanner.nextLine();
        }

            //вземам два аргумента К=key и V=values и отзад в аргументите за принтиране имам:
            // к- взема key от първия (от items) и v- взема value-то от втория, акто той е посочен v*quantities.get(k)
            items.forEach((k,v)->
                        System.out.printf("%s -> %.2f",k,v*quantities.get(k)).println());



        //вариант
        //quantities.forEach((k,v)-> System.out.println(String.format("%s -> %.2f",k,v*items.get(k))));
        quantities.forEach((k,v)-> System.out.printf("%s -> %.2f",k,v* items.get(k)).println());
    }
}
