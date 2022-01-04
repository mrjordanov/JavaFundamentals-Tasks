import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        String output="";
        if(input.equals("int")) {
            int a=Integer.parseInt(scanner.nextLine());
            int b=Integer.parseInt(scanner.nextLine());
            int result= integer(a,b);
            output=""+result;
        }

        else if (input.equals("string")) {
            String one= scanner.nextLine();
            String two= scanner.nextLine();
            String result= string (one,two);
            output=result;
        }

        else if (input.equals("char")) {
            char a=scanner.nextLine().charAt(0);
            char b=scanner.nextLine().charAt(0);
             String result= stringChar (a,b);
              output=result;
        }

        System.out.println(output);
    }

    private static int integer(int a, int b) {
        int value=0;
        if (a>b) {
            value=a;
        }
        else {
            value=b;
        }
        return value;
    }

    private static String string(String one, String two) {
        String value="";
        if (one.compareTo(two)>=0){
            value=one;
        }
        else {
            value=two;
        }
        return value;
    }

    private static String stringChar(char a, char b) {
        String value="";
        if (a>b){
            value=""+a;
        }
        else {
            value=""+b;
        }
        return value;
    }

}
