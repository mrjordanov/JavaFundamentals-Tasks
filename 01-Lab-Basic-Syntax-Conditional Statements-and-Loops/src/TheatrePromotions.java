import java.util.Locale;
import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        int price=0;
        if (day.equals("weekday")) {
            if (age >= 0 && age <= 18) {
                price=12;
               // System.out.println("12$");
            }  if (age > 18 && age <= 64) {
                price=18;
                //System.out.println("18$");
            } if (age > 64 && age <= 122) {
                price=12; }

               // System.out.println("12$");
           // } else {
            //    System.out.println("Error!");
          //  }
        }


        if (day.equals("weekend")) {
            if (age >= 0 && age <= 18) {
                price=15;
                //System.out.println("15$");
            }  if (age > 18 && age <= 64) {
                price=20;
               // System.out.println("20$");
            }  if (age > 64 && age <= 122) {
                price=15;
                //System.out.println("15$");
            } //else {
              //  System.out.println("Error!");
           // }
        }

        if (day.equals("holiday")) {
            if (age >= 0 && age <= 18) {
                price=5;
               // System.out.println("5$");
            }  if (age > 18 && age <= 64) {
                price=12;
               // System.out.println("12$");
            }  if (age > 64 && age <= 122) {
                price=10;
                //System.out.println("10$");
            } //else {
              //  System.out.println("Error!");
           // }
        }

        if (price==0) {
            System.out.println("Error!");
        }

        else {
            System.out.printf("%d$",price);
        }


    }
}
