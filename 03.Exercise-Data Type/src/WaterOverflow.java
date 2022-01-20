import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int sumOfFill=0;
        int restForFill=255;
        for (int i = 1; i <=n ; i++) {
            int curFill=Integer.parseInt(scanner.nextLine());

                if (curFill<=restForFill) {
                    restForFill-=curFill;
                    sumOfFill+=curFill;
                }
            else {
                System.out.println("Insufficient capacity!");
            }

        }

        System.out.println(sumOfFill);


    }
}
