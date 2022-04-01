import java.util.Scanner;

public class TextFilt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < arr.length; i++) {
            String cur = arr[i];
            String aster = "*";
            String replace = aster.repeat(cur.length());


            while (text.contains(cur)) {
                text = text.replace(cur,replace);
            }
        }

        System.out.println(text);


    }
}
