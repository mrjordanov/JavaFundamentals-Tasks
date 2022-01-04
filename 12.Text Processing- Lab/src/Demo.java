import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        String[] arr=new String[3];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=str;
            String repeat= String.join("",arr);
        }
        for (String s:arr) {
            System.out.printf("%s",s);
        }


    }
}
