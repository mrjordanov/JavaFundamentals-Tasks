import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> str = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        List<Integer> topNumbers = new ArrayList<>();


        double sum = 0;
        for (int i = 0; i < str.size(); i++) {
            numbers.add(Integer.parseInt(str.get(i)));
            sum += numbers.get(i);
        }

        double avv = sum / numbers.size();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > avv) {
                topNumbers.add(numbers.get(i));
            }
        }

        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (topNumbers.size() == 0) {
            System.out.print("No");
        }

        if (topNumbers.size() < 5 && topNumbers.size() > 0) {
            System.out.print(topNumbers.toString().replaceAll("[\\[\\],]", ""));
        }

        if (topNumbers.size() >= 5) {
            for (int i = 0; i <5 ; i++) {
                System.out.printf("%d ",topNumbers.get(i));
            }
        }

    }
}
