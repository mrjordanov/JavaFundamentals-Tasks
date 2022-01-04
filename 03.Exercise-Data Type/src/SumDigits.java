import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n= scanner.nextLine();
        int number= Integer.parseInt(n);

        int counter=0;
        int sumDigits=0;
        while (number>0) {
            counter++;
            sumDigits+=number%10;
            number=number/10;

            if (counter==n.length()) {
                break;
            }
        }

        System.out.println(sumDigits);

    }
}
