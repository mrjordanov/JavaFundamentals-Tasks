import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        BigInteger[] arr = new BigInteger[number];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = BigInteger.ONE;
            } else if (i == 1) {
                arr[i] = BigInteger.ONE;
            } else {
                arr[i] = arr[i-1].add(arr[i-2]);
            }

        }
        System.out.printf("%d", arr[number - 1]);


    }
}
