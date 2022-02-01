import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        if (numbers.length<=1){
            System.out.print("0");
            return;
        }
        //int split = 0;
        int index = 0;
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }

            if (leftSum == rightSum) {
                index = i;
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.print(index);
        } else {
            System.out.print("no");
        }
    }
}
