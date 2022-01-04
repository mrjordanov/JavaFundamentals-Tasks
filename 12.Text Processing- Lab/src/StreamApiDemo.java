import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str="Hello, hello, helo, heo";
       // Map<String,Integer > lengthByWord;

        Map<String, Integer> collect = Arrays.stream(str.split(", ")).collect(Collectors.toMap(e -> e, e -> e.length()));

        System.out.println(collect);
    }
}
