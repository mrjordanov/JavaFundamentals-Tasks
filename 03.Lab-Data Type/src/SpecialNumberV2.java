import java.util.Scanner;

public class SpecialNumberV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=count ; i++) {
            int digitSum=0;
            int currNum=i;
            while (currNum>0) {
                digitSum+=currNum%10;
                currNum=currNum/10;
            }

            boolean isSpecial= (digitSum==5)|| (digitSum==7)|| (digitSum==11);
            String str="";

            if (isSpecial) {
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
