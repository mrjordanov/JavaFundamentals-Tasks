import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split("\\s+");

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            String numberAsString= word.substring(1,word.length()-1);
            int number = Integer.parseInt(numberAsString);
            char left = word.charAt(0);
            char right = word.charAt(word.length() - 1);

            double result = 0;
            if (Character.isUpperCase(left)) {
                result = 1.00*number /(left-64);
            }
            else  {
                result = 1.00*number * (left-96);
            }
            if (Character.isUpperCase(right)) {
                result-=right-64;
            } else  {
                result+=right-96;
            }

            sum += result;
        }
        System.out.printf("%.2f",sum);
    }
}
