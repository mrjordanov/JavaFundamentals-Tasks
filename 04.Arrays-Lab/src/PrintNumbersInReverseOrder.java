import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        int[] arr=new int[number];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(scanner.nextLine());
        }

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.printf("%d ",arr[i]);
        }



    }
}
