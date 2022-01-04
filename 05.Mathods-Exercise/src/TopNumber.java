import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        topNumber(n);
    }

    private static void topNumber(int number) {
        for (int i = 1; i <= number; i++) {
            int curNum = i;

            int sumOfDigits = 0;
            while (curNum > 0) {
                int digit = curNum % 10;
                sumOfDigits += digit;
                curNum = curNum / 10;
            }

            if (sumOfDigits % 8 == 0) {
                int nextNum = i;
                while (nextNum > 0) {
                    int lastNumber = nextNum % 10;
                    if (lastNumber % 2 != 0) {
                        System.out.println(i);
                        break;
                    } else {
                        nextNum = nextNum / 10;
                    }
                }
            }

        }
    }
}
