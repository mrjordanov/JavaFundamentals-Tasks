import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);

            int result = methodForReverseNumber(number);
            if (result == number) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }


    }

    private static int methodForReverseNumber(int number) {
        int reverse=0;
        while(number>0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        return  reverse;
    }

}
