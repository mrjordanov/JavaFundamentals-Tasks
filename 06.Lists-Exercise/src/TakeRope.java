import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> items = Arrays.stream(input.split("")).collect(Collectors.toList());
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) >= 48 && input.charAt(i) <= 57)) {
                integers.add(Integer.parseInt(String.valueOf(input.charAt(i))));
            } else {
                strings.add(items.get(i));
            }
        }

        List<Integer> take = new ArrayList<>();
        List<Integer> skip = new ArrayList<>();

        for (int i = 0; i < integers.size(); i++) {
            if (i % 2 == 0) {
                take.add(integers.get(i));
            } else {
                skip.add(integers.get(i));
            }
        }

        String result = "";
        int iterations = 0;
        while (iterations < take.size()) {
            int takeIndex = take.get(iterations);
            int skipIndex = skip.get(iterations);
            int index=0;

            if(strings.size()<takeIndex){
                index= strings.size();
            }
            else {
                index=takeIndex;
            }
            for (int i = 0; i < index; i++) {

                result += strings.get(i);
            }

            int numberOfSkipped = 0;

            int rule=0;
            if(strings.size()<takeIndex+skipIndex){
                rule= strings.size();
            }
            else {
                rule=takeIndex+skipIndex;
            }
            for (int i = 0; i < rule; i++) {
                numberOfSkipped++;
                strings.remove(0);

                if (numberOfSkipped == skipIndex + takeIndex) {
                    break;
                }
            }

            iterations++;
        }

        System.out.print(result);
    }
}


