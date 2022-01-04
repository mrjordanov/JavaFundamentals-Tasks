import java.util.Scanner;

public class DigitsLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char cur = input.charAt(i);
            if (Character.isAlphabetic(cur)) {
                letters.append(cur);
            } else if (Character.isDigit(cur)) {
                digits.append(cur);
            } else {
                chars.append(cur);
            }
        }
       // letters.replace(0,2,"!");
        System.out.println(digits);
        System.out.println(letters);
        System.out.print(chars);
    }
}
