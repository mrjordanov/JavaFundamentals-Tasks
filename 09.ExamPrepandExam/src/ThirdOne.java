
import java.util.Arrays;
import java.util.Scanner;


public class ThirdOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int entryIndex = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int leftSum = 0;
        int rightSum = 0;

        if (command.equals("cheap")) {
            for (int i = 0; i < entryIndex; i++) {
                if (array[i] < array[entryIndex]) {
                    leftSum += array[i];
                }
            }

            for (int i = entryIndex + 1; i < array.length; i++) {
                if (array[i] < array[entryIndex]) {
                    rightSum += array[i];
                }
            }

        }
        if (command.equals("expensive")) {

            for (int i = 0; i < entryIndex; i++) {
                if (array[i] >= array[entryIndex]) {
                    leftSum += array[i];
                }
            }

            for (int i = entryIndex + 1; i < array.length; i++) {
                if (array[i] >= array[entryIndex]) {
                    rightSum += array[i];
                }
            }

        }

        if (leftSum>=rightSum){
            System.out.printf("Left - %d",leftSum);
        } else {
            System.out.printf("Right - %d",rightSum);
        }

    }

}
