import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        String expression="!(?<command>[A-Z][a-z][a-z]+)!\\:\\[(?<message>[A-Za-z]{8,})\\]";
        Pattern regex=Pattern.compile(expression);

        for (int i = 0; i <n ; i++) {
            String input= scanner.nextLine();
            Matcher matcher= regex.matcher(input);
            if (matcher.find()) {
               String command= matcher.group("command");
               String message= matcher.group("message");
               String last="";
                for (int j = 0; j <message.length() ; j++) {
                    int cur=message.charAt(j);
                    last+=cur+" ";
                }
                System.out.printf("%s: %s",command,last).println();
            }
            else {
                System.out.println("The message is invalid");
            }
        }
    }
}
