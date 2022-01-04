import java.awt.*;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i <input.length() ; i++) {
            char cur=input.charAt(i);
            sb.append((char) (cur+3));
        }

        System.out.println(sb);

        ///2вариант
        String result="";
        for (int i = 0; i <input.length() ; i++) {
            int cur=input.charAt(i);
            int newest=cur+3;
           result=result.concat(String.format("%c",newest));
        }

        System.out.println(result);
    }
}
