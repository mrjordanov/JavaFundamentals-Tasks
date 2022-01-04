import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber=Integer.parseInt(scanner.nextLine());
        String operator= scanner.nextLine();
        int secondNumber=Integer.parseInt(scanner.nextLine());

        int result= calculation(firstNumber,operator,secondNumber);
        System.out.print(result);
    }

    public static int calculation (int a, String operation, int b) {
        int result=0;

        if (operation.equals("+")){
            result=a+b;
        }
        if (operation.equals("-")) {
            result=a-b;
        }
        if (operation.equals("*")) {
            result=a*b;
        }
        if (operation.equals("/")) {
            result=a/b;
        }
        return  result;
    }


}
