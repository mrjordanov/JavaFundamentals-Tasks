import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        List<String> a = Arrays.stream(one.split(" ")).collect(Collectors.toList());
        List<String> b = Arrays.stream(two.split(" ")).collect(Collectors.toList());

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            first.add(Integer.parseInt(a.get(i)));
        }

        for (int i = 0; i < b.size(); i++) {
            second.add(Integer.parseInt(b.get(i)));
        }

        List<Integer> mixed = new ArrayList<>();
        mixed.addAll(first);
        mixed.addAll(second);

        List<Integer> finalResult = new ArrayList<>();

        for (int i = 0; i < mixed.size(); i++) {
            if (first.size() > second.size()) {
                if ((first.get(first.size() - 2)) > first.get(first.size() - 1)) {
                    if (mixed.get(i) > first.get(first.size() - 1) && mixed.get(i) < (first.get(first.size() - 2))) {
                        finalResult.add(mixed.get(i));
                    }
                }
                if ((first.get(first.size() - 2)) < first.get(first.size() - 1)) {
                    if (mixed.get(i) > first.get(first.size() - 2) && mixed.get(i) < (first.get(first.size() - 1))) {
                        finalResult.add(mixed.get(i));
                    }
                }
            }

            else {
                if(second.size()>first.size()){
                    if ((second.get(0)) > second.get(1)) {
                        if (mixed.get(i) > second.get(1) && mixed.get(i) < (second.get(0))) {
                            finalResult.add(mixed.get(i));
                        }
                    }
                    if ((second.get(0)) < second.get(1)) {
                        if (mixed.get(i) > second.get(0) && mixed.get(i) < (second.get(1))) {
                            finalResult.add(mixed.get(i));
                        }
                    }
                }
            }

        }
        Collections.sort(finalResult);
        for (int i = 0; i < finalResult.size() ; i++) {
            System.out.printf("%d ",finalResult.get(i));
        }



    }
}
