import java.util.Scanner;

public class ExtractInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            StringBuilder line = new StringBuilder(input);
            StringBuilder name = new StringBuilder();
            StringBuilder age = new StringBuilder();
            int startIndex = line.indexOf("@");
            int endIndex = line.indexOf("|");
            for (int j = startIndex + 1; j < endIndex; j++) {
                name.append(input.charAt(j));
            }

            int startIndexAge=line.indexOf("#");
            int endIndexAge=line.indexOf("*");

            for (int j = startIndexAge+1; j <endIndexAge ; j++) {
                age.append(input.charAt(j));
            }

            System.out.printf("%s is %s years old.",name,age).println();
        }


    }
}
