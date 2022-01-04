import java.util.Scanner;

public class BitwiseOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int result = decimalToBinary(n,b);
        decimalToBinaryString(n, b);
        System.out.print(result);
    }

    public static int decimalToBinary(int number, int second) {
        int curNum = number;
        int sumZeros = 0;
        int sumOnes = 0;
        while (curNum > 0) {
            if ((curNum % 2) != 0) {
                sumOnes += 1;
            } else {
                sumZeros += 1;
            }
            curNum = curNum / 2;
        }
        if (second == 0) {
            return sumZeros;
        } else {
            return sumOnes;
        }
    }

    private static void decimalToBinaryString(int number, int second) {
        String last = "";
        int curNum = number;
        while (curNum > 0) {
            if ((curNum % 2) != 0) {
                last = 1+last;
            } else {

                last=0+last;
            }
            curNum = curNum / 2;
        }
        System.out.println(last);
    }

}
