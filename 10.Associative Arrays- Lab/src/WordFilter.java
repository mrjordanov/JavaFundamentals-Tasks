import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        //1ви вар от масив към лист и печата листа
        String[] words=input.split(" ");
        List<String> collect= Arrays.stream(words)
                .filter(n->n.length()%2==0).collect(Collectors.toList());

        for (String s:collect) {
            System.out.printf("%s",s).println();
        }


        //2вар от масив към масив и печата новия масив
        String[] str=Arrays.stream(input.split(" "))
                .filter(n->n.length()%2==0).toArray(String[]::new);

        for (String w:str) {
            System.out.printf("%s",w).println();
        }
    }
}
