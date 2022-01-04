import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "valid123@email.bg\n" +
                "invalid*name@emai1.bg\n" +
                "123@some.bg\n" +
                "som%@come.bg\n" +
                "123%come.bg";

        String expression = "\\w+@(?<domain>[A-Za-z]+)\\.([A-Za-z]+)";
        // String a="\\\\"; // ->\\
        Pattern regex = Pattern.compile(expression);
        Matcher matcher=regex.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group("domain"));
        }

        // System.out.println(matcher.find());
        //  System.out.println(matcher.group());
        //System.out.println();


    }
}
