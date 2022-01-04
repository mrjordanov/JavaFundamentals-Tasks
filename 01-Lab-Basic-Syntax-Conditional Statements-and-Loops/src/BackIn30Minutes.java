import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());


        if (minutes + 30 > 59) {
            hours = hours+1;
            int accMinutes =minutes-30;

            if (hours > 23) {
               hours = 0;
            }
            System.out.printf("%d:%02d",hours,accMinutes);


        } else {
            minutes=minutes+30;
            System.out.printf("%d:%02d", hours, minutes);
        }


    }
}
