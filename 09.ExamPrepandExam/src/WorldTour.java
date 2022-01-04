import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] arg = command.split(":");
            String task = arg[0];

            if (task.equals("Add Stop")) {
                int index = Integer.parseInt(arg[1]);
                String add = arg[2];
                if (index >= 0 && index <= sb.length() - 1) {
                    sb.insert(index, add);
                    System.out.println(sb);
                }
                else {
                    System.out.println(sb);
                }
            }
            if (task.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(arg[1]);
                int endIndex = Integer.parseInt(arg[2]);
                if (startIndex >= 0 && endIndex <= sb.length() - 1) {
                    sb.delete(startIndex, endIndex + 1);
                    System.out.println(sb);
                }
                else {
                    System.out.println(sb);
                }
            }
            if (task.equals("Switch")) {
                String match = arg[1];
                String replace = arg[2];
                String current = sb.toString();

                if (current.contains(match)){
                    String last = current.replace(match, replace);
                    sb = new StringBuilder(last);
                    System.out.println(sb);
                }
                else {
                    System.out.println(sb);
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",sb);

    }
}
