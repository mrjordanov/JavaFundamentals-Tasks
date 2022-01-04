import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        String[] str=input.split(" ");

        int[] arr=new int[str.length];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=Integer.parseInt(str[i]);
        }


        for (int i = 0; i <= arr.length-1; i++) {
            int curNum=arr[i];
            boolean isTopInteger=true;
            for (int j = i+1; j < arr.length ; j++) {
                if(curNum<=arr[j]){
                    isTopInteger=false;
                    break;
                }
            }

            if (isTopInteger){
                System.out.print(arr[i]+" ");
            }

        }

       // System.out.print(arr[arr.length-1]);

    }
}
