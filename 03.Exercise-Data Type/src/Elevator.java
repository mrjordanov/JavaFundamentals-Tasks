import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int liftTimes = (numberOfPeople / capacity);

         if (numberOfPeople <= capacity) {
            System.out.printf("1");
        }


        else {
             if (numberOfPeople % capacity == 0) {
                 System.out.printf("%d", liftTimes);
             }

             else  {
                 System.out.printf("%d", liftTimes+1);
             }
          //   else {
               //  System.out.printf("%d courses * %d people",liftTimes,numberOfPeople);
           //  }

        }


    }
}
