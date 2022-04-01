import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintLargestThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 вариант
    //  Arrays.stream(scanner.nextLine().split(" "))
        //        .map(n -> Integer.parseInt(n))
         //       .sorted((l,r)->r.compareTo(l))
           //     .limit(3)
           //     .forEach(n-> System.out.printf("%d ",n));


        //2 вариант
      List <Integer> number= Arrays.stream(scanner.nextLine().split(" "))
              .map(Integer::parseInt)
              .sorted((l,r)->r.compareTo(l))
              .collect(Collectors.toList());

        for (int i = 0; i < number.size() ; i++) {
            System.out.printf("%d ", number.get(i));
            if (i==2){
                break;
            }
        }
    }
}
