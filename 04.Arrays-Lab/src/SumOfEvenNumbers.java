import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] arr = input.split(" ");

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] newArr = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=Integer.parseInt(arr[i]);
            if (newArr[i] % 2 == 0) {
                sum += newArr[i];
            }
        }
        System.out.println(sum);


    }
}
