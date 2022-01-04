import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
       printSign(n);
    }

    public static void printSign(int number) {
        String sign="";
        if (number<0) {
           sign="negative";
        }
        if (number==0) {
          sign="zero";
        }
        if (number>0) {
           sign="positive";
        }
        System.out.printf("The number %d is %s.",number,sign);
    }



}
