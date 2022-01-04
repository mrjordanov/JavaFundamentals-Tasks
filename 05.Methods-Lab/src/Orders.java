import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalPrice = findTotalPrice(drink, quantity);
        System.out.printf("%.2f", totalPrice);
    }

    private static double findTotalPrice(String drink, double quantity) {
        double price=0;
           if (drink.equals("coffee")) {
               price=1.5;
           }
           if (drink.equals("water")) {
               price=1;
           }
        if (drink.equals("coke")) {
            price=1.4;
        }
        if (drink.equals("snacks")) {
            price=2;
        }

        return price*quantity;
    }
}
