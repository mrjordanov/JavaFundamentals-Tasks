import java.util.Scanner;

public class EqualSumV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.split(" ");

        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        boolean isFound=false;
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            int leftSum=0;

            for (int j = 0; j <i ; j++) {
                leftSum=leftSum+arr[j];
            }

            int rightSum=0;
            for (int j = i+1; j < arr.length ; j++) {
                rightSum+=arr[j];
            }

            if (leftSum==rightSum){
                index=i;
                isFound=true;
                break;
            }
        }

        if (isFound){
            System.out.println(index);
        }
        else {
            System.out.println("no");
        }

    }
}
