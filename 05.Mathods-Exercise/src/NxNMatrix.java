import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        nxnMatrix(number);

    }

    private static void nxnMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            int printedTimes = 0;
            for (int j = n; printedTimes < n; printedTimes++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
