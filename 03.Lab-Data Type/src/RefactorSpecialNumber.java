import java.util.Scanner;

public class RefactorSpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            int sum = 0;
           int curNum = i;
            while (curNum > 0) {
                sum += curNum % 10;
                curNum = curNum / 10;
            }

           boolean isMagic = (sum == 5) || (sum == 7) || (sum == 11);
            String str="";
            if (isMagic) {
                str="True";
                System.out.printf("%d -> %s",i,str).println();
            }
            else {
                str="False";
                System.out.printf("%d -> %s",i,str).println();
            }


        }



    }
}
