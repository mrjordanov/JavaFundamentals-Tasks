import java.util.Scanner;

public class FactorialDivisionV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());

        long firstFactorial= factorial(firstNumber);
        long secondFactorial=factorial(secondNumber);
        double result= 1.00*firstFactorial/secondFactorial;
        System.out.printf("%.2f",result);

    }

    private static long factorial(int firstNumber) {
        long factorial=1;
        for (int i = 1; i <=firstNumber ; i++) {
            factorial*=i;
        }
        return factorial;
    }
}
