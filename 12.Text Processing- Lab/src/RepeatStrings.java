import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String[] arr=input.split(" ");


        String res="";
        for (int i = 0; i < arr.length ; i++) {
            int repeat=arr[i].length();
            for (int j = 0; j <repeat ; j++) {
                res=res.concat(arr[i]);
            }
        }

         System.out.print(res);

    }
}
