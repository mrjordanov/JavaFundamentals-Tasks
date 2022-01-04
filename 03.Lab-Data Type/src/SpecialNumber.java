import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isSpecial = false;
        String str="";
        for (int i = 1; i <= n; i++) {
            if (((i % 10) + (i / 10)) == 5||((i % 10) + (i / 10)) == 7||((i % 10) + (i / 10)) == 11){
                isSpecial = true;
                str="True";
            }

            else{
                isSpecial = false;
                str="False";
            }


            System.out.printf("%d -> %s",i,str).println();
        }


    }
}
