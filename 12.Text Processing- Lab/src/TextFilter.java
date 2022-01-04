import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String banned= scanner.nextLine();
        String text= scanner.nextLine();
        String[] str=banned.split(", ");

        for (int i = 0; i < str.length ; i++) {
            String word= str[i];
            int length=str[i].length();
            String replace="";
            for (int j = 0; j <length ; j++) {
                replace+="*";
            }
            text=text.replace(word,replace);
        }

        System.out.print(text);
    }
}
