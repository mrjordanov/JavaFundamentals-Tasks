import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String expression = "\\|(?<name>[A-Z][A-Z][A-Z][A-Z]+)\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#";

        Pattern pattern = Pattern.compile(expression);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);


            if (matcher.find()){
                String boss= matcher.group("name");
                String title= matcher.group("title");
                System.out.printf("%s, The %s",boss,title).println();
                System.out.printf(">> Strength: %d",boss.length()).println();
                System.out.printf(">> Armor: %d",title.length()).println();
            } else {
                System.out.println("Access denied!");
            }

        }


    }
}
