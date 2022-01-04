import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String result="";
        for (int i = 0; i <input.length()-1 ; i++) {
            if (input.charAt(i)!=input.charAt(i+1)){
                int symbol=input.charAt(i);
                result=result.concat(String.format("%c",symbol));
            }
        }
        result=result.concat(String.valueOf(input.charAt(input.length()-1)));
        System.out.print(result);
    }
}
