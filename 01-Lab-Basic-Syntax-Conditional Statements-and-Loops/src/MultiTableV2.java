import java.util.Scanner;

public class MultiTableV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number= Integer.parseInt(scanner.nextLine());
        int multiplier= Integer.parseInt(scanner.nextLine());

        if (multiplier<=10) {
            for (int i = multiplier; i <=10 ; i++) {
                int result= number*i;
                System.out.printf("%d X %d = %d",number,i,result).println();
            }
        }

        else {
            int result=number*multiplier;
            System.out.printf("%d X %d = %d",number,multiplier,result);
        }



    }
}
