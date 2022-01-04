import java.util.Scanner;

public class TopNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int curNum=i;

            int sumOfDigits=0;
            while(curNum>0){
                int digit=curNum%10;
                sumOfDigits+=digit;
                curNum=curNum/10;
            }

            if (sumOfDigits%8==0){
                int nextNum=i;
                while (nextNum>0){
                    int number=nextNum%10;
                    if (number%2!=0){
                        System.out.println(i);
                        break;
                    }
                    else {
                        nextNum=nextNum/10;
                    }
                }
            }


        }


    }
}
