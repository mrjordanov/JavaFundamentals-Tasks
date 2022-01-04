import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        String[] arrOne=new String[n];
        String[] arrTwo=new String[n];
        for (int i = 1; i <=n ; i++) {
                 String input= scanner.nextLine();
                 String[] arr=input.split(" ");

            for (int j = 0; j <arr.length-1 ; j++) {
                if (i%2!=0) {
                    arrOne[i-1]=arr[j];
                    arrTwo[i-1]=arr[j+1];
                }
                else {
                    arrTwo[i-1]=arr[j];
                    arrOne[i-1]=arr[j+1];
                }
            }
        }
        System.out.println(String.join(" ",arrOne));
        System.out.println(String.join(" ",arrTwo));
        //for (int j = 0; j < arrOne.length ; j++) {
       //     System.out.printf("%s ",arrOne[j]);
       // }
       // System.out.println();
      //  for (int j = 0; j < arrTwo.length ; j++) {
      //      System.out.printf("%s ",arrTwo[j]);
       // }

    }
}
