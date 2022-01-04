import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int[] arr=new int[n];
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=Integer.parseInt(scanner.nextLine());
            sum+=arr[i];
        }
        for (int num:arr) {
            System.out.printf("%d ",num);
        }
        System.out.println();
        System.out.println(sum);



    }
}
