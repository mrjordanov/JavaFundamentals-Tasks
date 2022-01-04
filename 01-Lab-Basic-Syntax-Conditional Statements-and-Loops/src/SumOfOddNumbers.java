import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int printedOdds=0;
        int sum=0;
        for (int i = 1; printedOdds <=n ; i++) {
            if (i%2!=0) {
               printedOdds++;
                System.out.println(i);
                sum=sum+i;
            }

            if (printedOdds==n) {
                System.out.printf("Sum: %d",sum);
                break;
            }
        }




    }
}
