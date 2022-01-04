import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String one = scanner.nextLine();
        String two = scanner.nextLine();

        String[] arrOne = one.split(" ");
        String[] arrTwo = two.split(" ");

        int[] newArrOne = new int[arrOne.length];
        int[] newArrTwo = new int[arrTwo.length];

        int sum = 0;
        int diffIndex = 0;
        boolean isEqual = true;
        for (int i = 0; i < newArrTwo.length; i++) {
            newArrOne[i] = Integer.parseInt(arrOne[i]);
            newArrTwo[i] = Integer.parseInt(arrTwo[i]);

            if (newArrOne[i] == newArrTwo[i]) {
                sum += newArrOne[i];
            } else {
                diffIndex = i;
                isEqual = false;
                break;
            }

        }
        if (!isEqual) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }


    }
}
