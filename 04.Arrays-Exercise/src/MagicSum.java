import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        int n=Integer.parseInt(scanner.nextLine());

        String[] str=input.split(" ");
        int[] arr=new int[str.length];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=Integer.parseInt(str[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==n){
                    System.out.print(arr[i]+" "+arr[j]);
                    System.out.println();
                }
            }

        }


    }
}
