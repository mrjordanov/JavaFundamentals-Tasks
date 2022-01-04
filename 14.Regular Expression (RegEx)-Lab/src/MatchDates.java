import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String expression="\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z][a-z])\\2(?<year>\\d{4})\\b";

        Pattern pattern= Pattern.compile(expression);
        Matcher matcher=pattern.matcher(input);

        while (matcher.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s",
                    matcher.group("day"),
                    matcher.group("month"),
                    matcher.group("year")).println();
        }
    }
}
