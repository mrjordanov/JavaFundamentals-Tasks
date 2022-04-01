import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);


       Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).sorted((l, r) -> r.compareTo(l)).limit(3).forEach(System.out::println);

    }
}
