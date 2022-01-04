import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String expression = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        Pattern regex = Pattern.compile(expression);
        Matcher matcher = regex.matcher(input);

        while (matcher.find()) {
            System.out.printf("%s ", matcher.group());
        }
    }
}
