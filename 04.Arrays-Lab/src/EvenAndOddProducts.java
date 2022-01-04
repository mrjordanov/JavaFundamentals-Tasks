import java.util.Scanner;

public class EvenAndOddProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();

        String[] str= input.split(" ");

        int[] newArr=new int[str.length];

        int sumEvens=0;
        int sumOdds=0;
        for (int i = 0; i < newArr.length ; i++) {
            newArr[i]=Integer.parseInt(str[i]);
            if (newArr[i]%2==0) {
                sumEvens+=newArr[i];
            }
            else {
                sumOdds+=newArr[i];
            }
        }
        System.out.println(sumEvens-sumOdds);





    }
}
