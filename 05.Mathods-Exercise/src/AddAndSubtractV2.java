import java.util.Scanner;

public class AddAndSubtractV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());


        int result = sum(first, second) - subtract(third);
        System.out.print(result);
    }

    private static int sum(int first, int second) {
        return first + second;
    }

    private static int subtract(int third) {
        return third;
    }


}
