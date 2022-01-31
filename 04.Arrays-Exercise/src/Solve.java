import java.util.Arrays;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsString = lineOfNumbers.split(" ");
        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
            //System.out.print(numbers [i] + " ");
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

      //  System.out.print(Arrays.toString(numbers));
        System.out.print(Arrays.toString(numbers).replaceAll("[\\[\\],]",""));
    }
}
