import java.util.Locale;
import java.util.Scanner;

public class NikuldenCharity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        while (!line.equals("Finish")) {
            String[] arg = line.split(" ");
            String command = arg[0];

            if (command.equals("Replace")) {
                String current = arg[1];
                String newChar = arg[2];
                String replace = sb.toString().replace(current, newChar);
                sb = new StringBuilder(replace);
                System.out.println(sb);
            }
            if (command.equals("Cut")) {
                String start = arg[1];
                String end = arg[2];
                int startIndex = Integer.parseInt(arg[1]);
                int endIndex = Integer.parseInt(arg[2]);
                if (startIndex < 0 || endIndex > sb.length() - 1) {
                    System.out.println("Invalid indexes!");
                    line = scanner.nextLine();
                    continue;
                } else {
                    sb.delete(startIndex, endIndex + 1);
                    System.out.println(sb);
                }
            }
            if (command.equals("Make")) {
                String first = arg[1];
                if (first.equals("Upper")) {
                    String replace = sb.toString().toUpperCase();
                    sb = new StringBuilder(replace);
                    System.out.println(sb);
                }
                if (first.equals("Lower")) {
                    String replace = sb.toString().toLowerCase();
                    sb = new StringBuilder(replace);
                    System.out.println(sb);
                }
            }
            if (command.equals("Check")) {
                String check = arg[1];
                if (sb.toString().contains(check)) {
                    System.out.printf("Message contains %s", check).println();
                } else {
                    System.out.printf("Message doesn't contain %s", check).println();
                    line = scanner.nextLine();
                    continue;
                }
            }
            if (command.equals("Sum")) {
                String start = arg[1];
                String end = arg[2];
                int startIndex = Integer.parseInt(arg[1]);
                int endIndex = Integer.parseInt(arg[2]);

                if (startIndex >= 0 && endIndex <= sb.toString().length() - 1) {
                    String last = sb.substring(startIndex, endIndex + 1);
                    int sum=0;
                    for (int i = 0; i <last.length() ; i++) {
                        sum+=last.charAt(i);
                    }
                    System.out.println(sum);
                } else {
                    System.out.println("Invalid indexes!");
                    line = scanner.nextLine();
                    continue;
                }
            }
            line = scanner.nextLine();
        }
    }
}
