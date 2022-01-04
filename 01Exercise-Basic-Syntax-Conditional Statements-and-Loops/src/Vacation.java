import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number= Integer.parseInt(scanner.nextLine());
        String typeOfGroup= scanner.nextLine();
        String dayOfWeek= scanner.nextLine();

        double priceForPerson=0;
        double totalPrice=0;
        if (dayOfWeek.equals("Friday")) {
            if (typeOfGroup.equals("Students")) {
                priceForPerson = 8.45;
                totalPrice = number * priceForPerson;
                if (number >= 30) {
                    totalPrice = 0.85 * totalPrice;
                }
            }
            if (typeOfGroup.equals("Business")) {
                    priceForPerson=10.90;
                    totalPrice=number*priceForPerson;
                    if (number>=100) {
                        totalPrice=priceForPerson*(number-10);
                    }
            }
            if (typeOfGroup.equals("Regular")) {
                priceForPerson=15;
                totalPrice=number*priceForPerson;
                if (number>=10 && number<=20) {
                    totalPrice=0.95*totalPrice;
                }
            }
        }

        if (dayOfWeek.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                priceForPerson = 9.80;
                totalPrice = number * priceForPerson;
                if (number >= 30) {
                    totalPrice = 0.85 * totalPrice;
                }
            }
            if (typeOfGroup.equals("Business")) {
                priceForPerson=15.60;
                totalPrice=number*priceForPerson;
                if (number>=100) {
                    totalPrice=priceForPerson*(number-10);
                }
            }
            if (typeOfGroup.equals("Regular")) {
                priceForPerson=20;
                totalPrice=number*priceForPerson;
                if (number>=10 && number<=20) {
                    totalPrice=0.95*totalPrice;
                }
            }
        }

        if (dayOfWeek.equals("Sunday")) {
            if (typeOfGroup.equals("Students")) {
                priceForPerson = 10.46;
                totalPrice = number * priceForPerson;
                if (number >= 30) {
                    totalPrice = 0.85 * totalPrice;
                }
            }
            if (typeOfGroup.equals("Business")) {
                priceForPerson=16;
                totalPrice=number*priceForPerson;
                if (number>=100) {
                    totalPrice=priceForPerson*(number-10);
                }
            }
            if (typeOfGroup.equals("Regular")) {
                priceForPerson=22.50;
                totalPrice=number*priceForPerson;
                if (number>=10 && number<=20) {
                    totalPrice=0.95*totalPrice;
                }
            }
        }

        System.out.printf("Total price: %.2f",totalPrice);

    }
}
