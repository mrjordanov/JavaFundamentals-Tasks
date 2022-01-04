import java.util.Scanner;

public class PrintTriangleV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLine=Integer.parseInt(scanner.nextLine());
        printTriangle(maxLine);
    }

    public static void printTriangle(int maxLineNumber) {
        printTopHalf(maxLineNumber);
        printBottomHalf(maxLineNumber-1);
    }

    public static void printTopHalf (int numberOfRows) {
        for (int i = 1; i <=numberOfRows ; i++) {
         printRow(1,i);
            System.out.println();
        }
    }

    private static void printBottomHalf(int longestLine) {
        for (int i = longestLine; i >=1 ; i--) {
            printRow(1,i);
            System.out.println();
        }
    }

    private static void printRow(int from, int to) {
        for (int i = from; i <=to ; i++) {
            System.out.print(i+" ");
        }
    }
}
