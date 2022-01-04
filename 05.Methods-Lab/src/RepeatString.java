import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        int n=Integer.parseInt(scanner.nextLine());

        String result= FinalString(input,n);
        System.out.println(result);
    }

    private static String FinalString(String input, int n) {
        String first="";
        for (int i = 1; i <=n ; i++) {
            first+=input;
        }
        return  first;
    }


}
