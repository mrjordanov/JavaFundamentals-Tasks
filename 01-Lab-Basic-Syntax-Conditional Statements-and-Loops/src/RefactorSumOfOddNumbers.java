import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        int printedOdds=0;
        for (int i = 1; printedOdds <n ; i++) {
            if (i%2!=0) {
                System.out.println(i);
                sum=sum+i;
                printedOdds++;
            }
            //if (printedOdds==n) {
            //    System.out.printf("Sum: %d",sum);
               // break;
           // }
           // System.out.println(2*i+1);
          //  sum+=2*i;
        }
        System.out.printf("Sum: %d",sum);

      //  System.out.printf("Sum: %d%n",sum);
    }
}
