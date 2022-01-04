import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printCharBetweenTwoChars(first, second);
    }

    private static void printCharBetweenTwoChars(char first, char second) {
        char cur = first;
        if (first > second) {
            first = second;
            second = cur;
        }
        for (int i = first + 1; i < second; i++) {
            System.out.printf("%c ", i);
        }

    }
}
