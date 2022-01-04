import java.util.Scanner;

public class BeerKing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        double volume=0;
        double maxVolume=Double.NEGATIVE_INFINITY;
        String str="";
        for (int i = 1; i <=n ; i++) {
                String model= scanner.nextLine();
                float radius= Float.parseFloat(scanner.nextLine());
                int height= Integer.parseInt(scanner.nextLine());

                volume=Math.PI*radius*radius*height;

                if (volume>maxVolume) {
                    maxVolume=volume;
                    str=model;
                }
        }
        System.out.printf("%s",str);
        System.out.println("End");
    }
}
