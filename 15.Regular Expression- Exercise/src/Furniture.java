import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> furniture = new ArrayList<>();
        String expression = ">{2}(?<type>[A-Za-z]+)<{2}(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)";
        Pattern regex = Pattern.compile(expression);

        double totalSum = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = regex.matcher(input);
            if (matcher.find()) {
                furniture.add(matcher.group("type"));
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                 totalSum += price * quantity;

            }
            input = scanner.nextLine();
        }
       // furniture.forEach(i-> System.out.println(i) ); същото като долното
        System.out.println("Bought furniture:");
        for (String str : furniture) {
            System.out.println(str);
          }
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
