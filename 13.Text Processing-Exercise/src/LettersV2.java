import java.util.Scanner;

public class LettersV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split("\\s+");

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            String forNumber = "";
            for (int j = 0; j < word.length(); j++) {
                char cur = word.charAt(j);
                if (Character.isDigit(cur)) {
                    forNumber += String.valueOf(word.charAt(j));
                }
            }
            int number = Integer.parseInt(forNumber);
            char left = word.charAt(0);

            int temp = (int) left;
            int temp_integer = 0;
            double result = 0;
            int finalLeftDigit = 0;
            if (temp <= 90 & temp >= 65) {
                temp_integer = 64;
                finalLeftDigit = temp - temp_integer;
                result = 1.00*number / finalLeftDigit;
            }
            // result=number/finalLeftDigit;
            else if (temp <= 122 & temp >= 97) {
                temp_integer = 96;
                finalLeftDigit = temp - temp_integer;
                result = 1.00*number * finalLeftDigit;
            }

            char right = word.charAt(word.length() - 1);
            int tempR = (int) right;
            int tempR_integer = 0;
            int finalRightDigit = 0;
            double totalRes=0;
            if (tempR <= 122 & tempR >= 97) {
                tempR_integer = 96;
                finalRightDigit = tempR - tempR_integer;
                totalRes=result+finalRightDigit;

            } else if (tempR <= 90 & tempR >= 65) {
                tempR_integer = 64;
                finalRightDigit = tempR - tempR_integer;
                totalRes=result-finalRightDigit;
            }
            sum += totalRes;
        }
        System.out.printf("%.2f",sum);
    }
}
