import java.util.Scanner;

public class MultiplyV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int absNumber= Math.abs(number);

        int result= getMultipleOfEvenAndOdds(absNumber);
        System.out.print(result);
    }

    public  static int getMultipleOfEvenAndOdds(int n){
        int evenSum= getSumOfEvenDigits(n);
        int oddSum= getSumOfOddDigits(n);
        return evenSum*oddSum;
    }

    private static int getSumOfEvenDigits(int n) {
        int sumEvens=0;
        int curNum=n;
        while(curNum>0){
            if((curNum%10)%2==0) {
                sumEvens+=curNum%10;
            }
            curNum=curNum/10;
        }
        return sumEvens;
    }

    private static int getSumOfOddDigits(int n) {
        int sumOdds=0;
        int curNum=n;
        while(curNum>0){
            if((curNum%10)%2!=0) {
                sumOdds+=curNum%10;
            }
            curNum=curNum/10;
        }
        return sumOdds;
    }


}
