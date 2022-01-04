import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int inputLength = input.length();
            char[] str = input.toCharArray();
            int sum = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j] == 'a' || str[j] == 'e' || str[j] == 'i' || str[j] == 'o' || str[j] == 'u' || str[j] == 'y' || str[j] == 'A' || str[j] == 'E' ||
                        str[j] == 'I' || str[j] == 'O' || str[j] == 'U' || str[j] == 'Y') {
                    sum = sum + (inputLength * str[j]);
                } else {
                    sum = sum + (str[j] / inputLength);
                }
            }
            res.add(sum);
        }
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            System.out.printf("%d", res.get(i)).println();
        }
    }
}
