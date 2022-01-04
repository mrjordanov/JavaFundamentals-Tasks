import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number= Integer.parseInt(scanner.nextLine());


        int divider= 0;
        if (number%2==0) {
            divider=2;
        }
        if (number%3==0) {
            divider=3;
        }
         if (number%6==0) {
            divider=6;
        }
         if (number%7==0) {
            divider=7;
        }
         if (number%10==0) {
            divider=10;
        }

        if (divider==0) {
            System.out.println("Not divisible");
        }
        else {
            System.out.printf("The number is divisible by %d",divider);
        }


    }
}
