import java.math.BigDecimal;
import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());

        BigDecimal firstFactorial= factorial(firstNumber);
        BigDecimal secondFactorial=factorial(secondNumber);
        BigDecimal result= firstFactorial.divide(BigDecimal.valueOf(secondNumber));
        System.out.printf("%.2f",result);

    }

    private static BigDecimal factorial(int firstNumber) {
        BigDecimal factorial=BigDecimal.valueOf(1);
        for (int i = 1; i <=firstNumber ; i++) {
            factorial=factorial.multiply(BigDecimal.valueOf(i));
        }
        return factorial;
    }
}
