import java.util.Scanner;

public class ChatsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first=scanner.nextLine().charAt(0);
        char second=scanner.nextLine().charAt(0);
        char third= scanner.nextLine().charAt(0);

        String last=""+first+second+third+"";

        System.out.println(last);



    }
}
