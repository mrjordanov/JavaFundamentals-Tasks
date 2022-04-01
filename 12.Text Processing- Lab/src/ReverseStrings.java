
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder str = new StringBuilder();
        while (!input.equals("end")) {
            str.append(input);
            str.reverse();
            System.out.printf("%s = %s", input, str).println();
            str.setLength(0);
            // String reversed="";
            //  for (int i = input.length()-1; i >=0 ; i--) {
            // char ch= input.charAt(i);
            // reversed+=ch;
            // }
            //  System.out.printf("%s = %s",input,reversed).println();
            input = scanner.nextLine();
        }

    }
}
