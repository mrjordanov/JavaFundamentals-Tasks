import java.util.Scanner;

public class LowerUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char one=scanner.nextLine().charAt(0);

        if (one>='A'&& one<='Z') {
            System.out.println("upper-case");
        }

        else {
            System.out.println("lower-case");
        }





    }
}
