import java.util.Scanner;

public class GreaterOfTwoValuesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();

        if (input.equals("int")) {
            int a=Integer.parseInt(scanner.nextLine());
            int b= Integer.parseInt(scanner.nextLine());
            int result= getMax(a,b);
            System.out.print(result);
        }
        else if (input.equals("string")) {
            String one= scanner.nextLine();
            String two= scanner.nextLine();
            String output=  getMax(one,two);
            System.out.print(output);
        }
        else if (input.equals("char")) {
            char a=scanner.nextLine().charAt(0);
            char b=scanner.nextLine().charAt(0);
            char text= getMax(a,b);
            System.out.print(text);
        }


    }

    private static int getMax(int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }

    private static String getMax(String first, String second) {
        if(first.compareTo(second)>=0) {
            return first;
        }
        else {
            return second;
        }
    }

    private static char getMax(char first, char second) {
        if(first>second) {
            return first;
        }
        else {
            return second;
        }
    }


}
