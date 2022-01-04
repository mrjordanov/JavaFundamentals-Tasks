import java.util.Scanner;

public class AsciiSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first=scanner.nextLine().charAt(0);
        char second=scanner.nextLine().charAt(0);
        String input= scanner.nextLine();

        int sum=0;
        for (int i = 0; i < input.length(); i++) {
            char cur=input.charAt(i);
            if(cur>first && cur<second){
                sum+=cur;
            }
        }
        System.out.print(sum);
    }
}
