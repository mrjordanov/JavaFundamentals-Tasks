import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr=new int[] {1,2,3};
        multiplyByTwo(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    private static void multiplyByTwo(int[] input) {
        for (int i = 0; i< input.length ; i++) {
            input[i]=input[i]*2;
        }
    }
}
