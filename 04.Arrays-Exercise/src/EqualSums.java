import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] str = input.split(" ");

        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        if (arr.length <= 1) {
            System.out.print("0");
        } else {
            int sumLeft = 0;
            boolean isFound = false;
            int index=0;
            for (int i = 1; i < arr.length; i++) {
                sumLeft += arr[i - 1];
                int sumRight = 0;
                for (int j = arr.length - 1; j > i; j--) {
                    sumRight += arr[j];
                }

                if (sumLeft == sumRight) {
                    isFound = true;
                    index=i;
                    break;
                    //System.out.print(i);
                }

            }
            if (!isFound) {
                System.out.print("no");
            }
            else {
                System.out.print(index);
            }

        }


    }
}
