import java.math.BigDecimal;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        BigDecimal result = raisedNumber(number, power);

        System.out.printf("%.0f",result);
    }

    private static BigDecimal raisedNumber(double number, int power) {
        BigDecimal result= new BigDecimal(1);

        for (int i = 1; i <=power ; i++) {
            result=result.multiply(BigDecimal.valueOf(number));
        }
        return result;
    }


}
