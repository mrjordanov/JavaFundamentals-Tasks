import java.util.Scanner;

public class PalindromeV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);


            if (isNumberPalindrome(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }


    }

    private static boolean isNumberPalindrome(int number) {
        int curNum=number;
        int reverse=0;
        while(number>0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        boolean result=reverse==curNum;
        return result;
    }

}
