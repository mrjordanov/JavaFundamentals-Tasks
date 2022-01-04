import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        String[] str=input.split(" ");

        int[] arr=new int[str.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=Integer.parseInt(str[i]);
        }

        while(arr.length>1) {

            int[] condensed= new int[arr.length-1];
            for (int i = 0; i < arr.length-1; i++) {
                condensed[i]=arr[i]+arr[i+1];
            }
            arr=condensed;
        }
            System.out.print(arr[0]);

    }
}
