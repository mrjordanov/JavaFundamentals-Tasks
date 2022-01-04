import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int absNumber= Math.abs(number);

        int sum= multipliedSumOfEvenAndOdds(absNumber);
        System.out.print(sum);
    }

    private static int multipliedSumOfEvenAndOdds(int number) {
        int curNum=number;
        int sumOfEvens=0;
        int sumOfOdds=0;
        while (curNum>0){
           if ((curNum%10)%2==0){
               sumOfEvens+=(curNum%10);
           }
           else {
               sumOfOdds+=(curNum%10);
           }

           curNum=curNum/10;
        }

        return  sumOfEvens*sumOfOdds;
    }



}
