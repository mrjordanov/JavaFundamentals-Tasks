import java.math.BigInteger;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());



        for (int j = 0; j <number ; j++) {
            if (j==0){
                System.out.println("1");
                continue;
            }
            int[] arr = new int[j+1];
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    arr[i] = 1;
                } else if (i == 1) {
                    arr[i] = 1;
                } else {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }

                System.out.printf("%d ", arr[i]);
            }
            System.out.println();
        }
    }
}
