import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr=new int[] {1,2,3};
        int[] arr2=arr;
        multiplyByTwo(arr2);
        System.out.println("Arr2:");
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Arr:");
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
