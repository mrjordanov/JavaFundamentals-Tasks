import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String expression="\\+359(\\-|| )2\\1\\d{3}\\1\\d{4}\\b";
                          //\+359([\- ])2\1\d{3}\1\d{4}\b равносилни са изразите в скобите!
        String exp="\\+359+([\\-||\\/])2\\1[0-9]{3}\\1[0-9]{4}\\b";
        Pattern regex= Pattern.compile(expression);
        Pattern reg= Pattern.compile(exp);
        Matcher matcher=regex.matcher(input);


       List<String> result=new ArrayList<>();
        while (matcher.find()){
           result.add(matcher.group());
        }

        System.out.println(result.toString().replaceAll("[\\[\\]]",""));
    }
}
