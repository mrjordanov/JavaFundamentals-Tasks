import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String arg = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        while (!arg.equals("Reveal")) {
            String[] token = arg.split(":\\|:");
            String command = token[0];

            if (command.equals("InsertSpace")) {
                int index = Integer.parseInt(token[1]);
                sb.insert(index, " ");
                System.out.println(sb);
            }
            if (command.equals("Reverse")) {
                String replace = token[1];
                if (!sb.toString().contains(replace)) {
                    System.out.println("error");
                    arg= scanner.nextLine();
                    continue;
                }

                int index = sb.indexOf(replace);
                sb.delete(index, index + replace.length());
                StringBuilder reversed = new StringBuilder(replace);
                reversed.reverse();
                sb.append(reversed);
                System.out.println(sb);
            }
            if (command.equals("ChangeAll")) {
                String substring = token[1];
                String replace = token[2];
                String replaced = sb.toString().replace(substring, replace);
                sb = new StringBuilder(replaced);
                System.out.println(sb);
            }


            arg = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", sb);

    }
}
