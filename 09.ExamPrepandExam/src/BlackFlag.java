import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays=Integer.parseInt(scanner.nextLine());
        int dailyPlunder=Integer.parseInt(scanner.nextLine());
        double expectedPlunder=Double.parseDouble(scanner.nextLine());

        double collectedPlunder=0;
        for (int i = 1; i <=numberOfDays ; i++) {
            collectedPlunder+=dailyPlunder;

            if (i%3==0 && i%5==0) {
                collectedPlunder+=(0.5*dailyPlunder);
                collectedPlunder=0.7*collectedPlunder;
                continue;
            }

            if (i%3==0){
                collectedPlunder+=0.5*dailyPlunder;
            }
            if (i%5==0){
                collectedPlunder=0.7*collectedPlunder;
            }

        }

        double percentageCollected=(collectedPlunder/expectedPlunder)*100;

        if (collectedPlunder>=expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",collectedPlunder);
        }

        else {
            System.out.printf("Collected only %.2f%s of the plunder.",percentageCollected,"%");
        }

    }
}
