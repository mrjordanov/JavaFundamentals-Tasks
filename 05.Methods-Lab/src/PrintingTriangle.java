import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTriangle(n);
    }

    private static void printTriangle(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.printf("%d ",j);
            }
            System.out.println();

            if (i==n){
                for (int j = n-1; j >=1 ; j--) {
                    for (int k = 1; k <=j ; k++) {
                        System.out.printf("%d ",k);
                    }
                    System.out.println();
                }
            }
        }

    }
}
