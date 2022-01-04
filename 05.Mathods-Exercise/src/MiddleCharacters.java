import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        String result= printMiddleChars(input);
        System.out.print(result);
    }

    private static String printMiddleChars(String input) {
        String str="";
            char c=input.charAt(input.length()/2);
            char b=input.charAt((input.length()/2)-1);
        if(input.length()%2!=0){
                str+=c;
        }
        else {
            str=""+b+""+c;
        }
        return str;
    }
}
