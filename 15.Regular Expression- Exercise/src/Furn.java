import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String expression = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+(\\.\\d+)?)!(?<quantity>[1-9]+)";

        List<String> bought = new LinkedList<>();
        double totalSum = 0;

        Pattern pattern = Pattern.compile(expression);

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                bought.add(matcher.group("furniture"));
                totalSum += Double.parseDouble(matcher.group("price"))
                        * Double.parseDouble(matcher.group("quantity"));
            }

            input = scanner.nextLine();
        }
        System.out.printf("Boguth: ").println();
        for (String s : bought) {
            System.out.println(s);
        }
        System.out.printf("Total money: %.2f",totalSum);
    }
}
