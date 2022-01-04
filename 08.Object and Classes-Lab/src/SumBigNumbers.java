import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        BigInteger first = new BigInteger(String.valueOf(one));
        BigInteger second = new BigInteger(String.valueOf(two));


        BigInteger sum = first.add(second);
        System.out.println(sum);
    }

}
