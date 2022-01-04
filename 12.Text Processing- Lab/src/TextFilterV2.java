import java.util.Scanner;

public class TextFilterV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String banned= scanner.nextLine();
        String text= scanner.nextLine();


        String[] str=banned.split(", ");
        for (String bannedWord:str) {
            String stars=getStarString(str.length);
            text=text.replace(bannedWord,stars);
        }
        System.out.print(text);
    }

    private static String getStarString(int length) {
        String result="";
        for (int i = 0; i <length ; i++) {
            result+="*";
        }
        return result;
    }
}
