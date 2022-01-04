import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int third=Integer.parseInt(scanner.nextLine());


        int sum= sum(first,second);
        int result=subtract(sum,third);
        System.out.print(result);
    }

    private static int sum(int first, int second) {
        return first+second;
    }

    private static int subtract(int sum,int third) {
             return sum-third;
    }


}
