import java.util.*;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();

        List<String> one = Arrays.stream(inputOne.split(" ")).collect(Collectors.toList());
        List<String> two = Arrays.stream(inputTwo.split(" ")).collect(Collectors.toList());

        List<Integer> first = new ArrayList<>();
        for (int i = 0; i < one.size(); i++) {
            first.add(Integer.parseInt(one.get(i)));
        }

        List<Integer> second = new ArrayList<>();
        for (int i = 0; i < two.size(); i++) {
            second.add(Integer.parseInt(two.get(i)));
        }

        for (int i = 0; i < one.size(); i++) {
            for (int j = i; j <= i; j++) {
                if (j == two.size()) {
                    for (i = j; i < one.size(); i++) {
                        System.out.printf("%d ", first.get(i));

                    }
                    break;
                } else if (i == one.size() - 1) {
                    System.out.printf("%d ", first.get(i));
                    for (j = i; j < two.size(); j++) {
                        System.out.printf("%d ", second.get(j));

                    }
                    break;

                }
                System.out.printf("%d %d ", first.get(i), second.get(j));
            }
        }


    }
}
