import java.util.Scanner;

public class RepeatWithStrBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < arr.length; i++) {
            String cur = arr[i];
            int length = arr[i].length();
            for (int j = 0; j <length ; j++) {
                sb.append(cur);
            }
        }

        System.out.println(sb);

    }
}
