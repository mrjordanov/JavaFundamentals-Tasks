import java.util.Scanner;

public class DAyV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day=Integer.parseInt(scanner.nextLine());
        String[] week={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        for (int i = 0; i < week.length ; i++) {
            if (i==day-1){
                System.out.println(week[i]);
                break;
            }

            if(day> week.length || day<1) {
                System.out.println("Invalid day!");
                break;
            }
        }

    }
}
