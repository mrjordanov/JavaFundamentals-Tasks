import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String expression = "%(?<customer>[A-Z][a-z]+)%[^|%.$]*<(?<product>\\w+)>[^|%.$]*\\|(?<count>\\d+)\\|[^|%.$]*(?<price>\\d+\\.?\\d+)\\$";
        // expName="%(?<customer>[A-Z][a-z]+)%";
        //expProduct="<(?<product>\w+)>";
        //expCount="\|(?<count>\d+)\|";
        //expPrice="(?<price>\d+\.?\d+)\$";
        Pattern regex = Pattern.compile(expression);
        double totalAmountForDay=0;
        while (!input.equals("end of shift")) {
            Matcher matcher = regex.matcher(input);

            if (matcher.find()) {
                double totalPrice = Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f", matcher.group("customer"), matcher.group("product"), totalPrice).println();
                totalAmountForDay+=totalPrice;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalAmountForDay);

    }
}
