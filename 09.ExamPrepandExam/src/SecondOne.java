import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] arg = command.split(" ");
            String task = arg[0];
            int value = Integer.parseInt(arg[1]);

            if (arg[0].equals("Add")) {
                numbers.add(value);
            }

            if (arg[0].equals("Remove")) {
                if (!numbers.isEmpty()){
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == value) {
                            numbers.remove(i);
                            break;
                        }
                    }
                } else {
                    command=scanner.nextLine();
                    continue;
                }
            }

            if (arg[0].equals("Replace")) {
                if(!numbers.isEmpty()){
                    int replacement = Integer.parseInt(arg[2]);
                    if (numbers.contains(value)) {
                        for (int i = 0; i < numbers.size(); i++) {
                            int curNum = numbers.get(i);
                            if (curNum == value) {
                                numbers.set(i, replacement);
                                break;
                            }
                        }
                    }
                } else {
                    command= scanner.nextLine();
                    continue;
                }
            }

            if (arg[0].equals("Collapse")) {
                if (!numbers.isEmpty()){
                    numbers= numbers.stream().filter(n -> n > value).collect(Collectors.toList());
                } else {
                    command= scanner.nextLine();
                    continue;
                }
            }

            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.printf("%d ",number);
        }
    }
}
