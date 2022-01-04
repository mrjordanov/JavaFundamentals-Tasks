import java.util.Scanner;

public class ReverseChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", third,two,one);

    }
}
