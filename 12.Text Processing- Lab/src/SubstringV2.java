import java.util.Scanner;

public class SubstringV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String remove= scanner.nextLine();
        String input= scanner.nextLine();

        while (input.contains(remove)){
            input=input.replace(remove,"");
        }

        System.out.print(input);
    }
}
