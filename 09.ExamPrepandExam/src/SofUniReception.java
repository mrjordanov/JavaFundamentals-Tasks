import java.util.Scanner;

public class SofUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int numberOfStudentsToHandle = Integer.parseInt(scanner.nextLine());

        int totalStudentsPerHour = first + second + third;
        int counter = 0;
        int totalHours = 0;
        while (numberOfStudentsToHandle > 0) {
            counter++;
            totalHours += 1;
            if (counter % 4 == 0 ) {
                continue;
            }
            if (numberOfStudentsToHandle <= totalStudentsPerHour) {
                break;
            }

            numberOfStudentsToHandle =  numberOfStudentsToHandle - totalStudentsPerHour;
        }

        System.out.printf("Time needed: %dh.",totalHours);
    }
}
