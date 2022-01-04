import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> items = Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        boolean isEmpty = false;
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            List<String> treasure = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            List<String> collection = new ArrayList<>();
            for (int i = 1; i < treasure.size(); i++) {
                collection.add(treasure.get(i));
            }

            if (treasure.get(0).equals("Loot")) {
                for (int i = 0; i < collection.size(); i++) {
                    for (int j = 0; j < items.size(); j++) {
                        if (collection.get(i).equals(items.get(j))) {
                            collection.remove(i);
                        }
                    }
                }
                for (int i = 0; i < items.size(); i++) {
                    items.add(i, collection.get(collection.size() - 1 - i));
                    if (i == collection.size() - 1) {
                        break;
                    }
                }
            }

            if (treasure.get(0).equals("Drop")) {
                int index = Integer.parseInt(treasure.get(1));
                if (index >= 0 && index <= items.size() - 1) {
                    String value = items.get(index);
                    items.remove(index);
                    items.add(value);
                } else {
                    command = scanner.nextLine();
                    continue;
                }
            }

            if (treasure.get(0).equals("Steal")) {
                int count = Integer.parseInt(treasure.get(1));
                int counter = 0;
                String stolen = "";
                if (count >= items.size()) {
                    isEmpty = true;
                    for (int i = 0; i < items.size(); i++) {
                        if (i == items.size() - 1) {
                            System.out.printf("%s", items.get(i));
                        } else {
                            System.out.printf("%s, ", items.get(i));
                        }
                    }
                    command = scanner.nextLine();
                    continue;
                } else {
                    for (int i = items.size() - 1; i >= 0; i--) {
                        stolen = items.get(i) + ", " + stolen;
                        items.remove(i);
                        counter++;
                        if (counter == count) {
                            break;
                        }
                    }
                    System.out.println(stolen.substring(0, (stolen.length() - 2)));
                }
            }
            command = scanner.nextLine();
        }

        double sumOfLengths = 0;
        for (int i = 0; i < items.size(); i++) {
            int curLength = items.get(i).length();
            sumOfLengths += curLength;
        }

        double avv = sumOfLengths / items.size();
        if (isEmpty | sumOfLengths == 0) {
            System.out.println();
            System.out.print("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", avv);
        }
    }
}