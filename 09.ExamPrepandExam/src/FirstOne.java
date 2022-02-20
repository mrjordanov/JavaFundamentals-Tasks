import java.util.Scanner;

public class FirstOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double priceForPackageFlour = Double.parseDouble(scanner.nextLine());
        double priceForEgg = Double.parseDouble(scanner.nextLine());
        double priceForApron = Double.parseDouble(scanner.nextLine());

        double totalApron = Math.ceil(numberOfStudents * 1.2);
        int freeFlour = numberOfStudents / 5;

        double totalAmount = priceForApron * totalApron + 10 * priceForEgg * numberOfStudents
                + priceForPackageFlour * (numberOfStudents -freeFlour);


        double rest=budget-totalAmount;

        if(rest>=0){
            System.out.printf("Items purchased for %.2f$.",totalAmount).println();
        } else {
            System.out.printf("%.2f$ more needed.",Math.abs(rest));
        }

    }
}
