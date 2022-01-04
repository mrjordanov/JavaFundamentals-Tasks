import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (input.equals("add")) {
            add(firstNumber, secondNumber);
        } else if (input.equals("multiply")) {
            multiply(firstNumber, secondNumber);
        } else if (input.equals("subtract")) {
            subtract(firstNumber, secondNumber);
        } else if (input.equals("divide")) {
            divide(firstNumber, secondNumber);
        }

    }

    private static void divide(int firstNumber, int secondNumber) {
        System.out.print(firstNumber / secondNumber);
    }

    private static void subtract(int firstNumber, int secondNumber) {
        System.out.print(firstNumber - secondNumber);
    }

    private static void multiply(int firstNumber, int secondNumber) {
        System.out.print(firstNumber * secondNumber);
    }

    private static void add(int a, int b) {
        System.out.print(a + b);
    }


}
