import java.util.Scanner;

public class Build {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String arg = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);


        while (!arg.equals("Finish")) {
            String[] token = arg.split(" ");
            String command = token[0];

            if (command.equals("Replace")) {
                String match = token[1];
                String replace = token[2];
                String result = sb.toString().replace(match, replace);
                System.out.println(result);
                sb = new StringBuilder(result);
            }

            if (command.equals("Cut")) {
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);
                if (startIndex < 0 || endIndex >= sb.toString().length()) {
                    System.out.println("Invalid indices!");
                    arg = scanner.nextLine();
                    continue;
                }
                String curr = sb.toString();
                String cut = curr.substring(startIndex, endIndex+1);
                String result = curr.replace(cut, "");
                sb = new StringBuilder(result);
                System.out.println(sb);

            }

            if (command.equals("Make")) {
                if (token[1].equals("Upper")) {
                    String result = sb.toString().toUpperCase();
                    sb = new StringBuilder(result);
                    System.out.println(sb);
                }
                if (token[1].equals("Lower")) {
                    String result = sb.toString().toLowerCase();
                    sb = new StringBuilder(result);
                    System.out.println(sb);
                }
            }

            if (command.equals("Check")) {
                String toCheck = token[1];

                if (sb.toString().contains(toCheck)) {
                    System.out.printf("Message contains %s", toCheck).println();
                } else {
                    System.out.printf("Message doesn't contain %s", toCheck).println();
                }
            }

            if (command.equals("Sum")) {
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);
                if (startIndex < 0 || endIndex >= sb.toString().length()) {
                    System.out.println("Invalid indices!");
                    arg = scanner.nextLine();
                    continue;
                }
                String cut = sb.toString().substring(startIndex, endIndex+1);
                int sum = 0;
                for (int i = 0; i < cut.length(); i++) {
                    char cur = cut.charAt(i);
                    sum += cur;
                }
                System.out.println(sum);
            }


            arg = scanner.nextLine();
        }


    }
}
