import java.util.Random;
import java.util.Scanner;

public class RandomizeV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = scanner.nextLine().split(" ");

        Random random = new Random();

        System.out.println(random.nextInt(10) + 5);//// първоначално границата е от 0 до 10;
        // след като дадем +5 ,  границата става от 5 до 15;

    }
}
