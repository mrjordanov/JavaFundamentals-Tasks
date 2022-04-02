import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Rac {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> players = new LinkedHashMap<>();

        String input = scanner.nextLine();

        String regexForDigits = "(?<digits>[0-9])";
        Pattern patternDigit = Pattern.compile(regexForDigits);

        String regexForName = "(?<name>[A-Za-z]+)";
        Pattern patternForName = Pattern.compile(regexForName);

        while (!input.equals("end of race")) {
            Matcher matchForName = patternForName.matcher(input);
            Matcher matchForDigits = patternDigit.matcher(input);

            String name = "";
            while (matchForName.find()) {
                name += matchForName.group("name");
            }

            if (participants.contains(name)) {
                players.putIfAbsent(name, 0);

                int distance = 0;

                while (matchForDigits.find()) {
                    distance += Integer.parseInt(matchForDigits.group("digits"));
                }
                players.put(name, players.get(name) + distance);

            }

            input = scanner.nextLine();
        }

        List<String> output= new ArrayList<>();
        output.add("1st place: ");
        output.add("2nd place: ");
        output.add("3rd place: ");


        players.entrySet()
                .stream()
                .sorted((p1,p2)->p2.getValue().compareTo(p1.getValue()))
                .limit(3)
                .forEach(p-> {
                    System.out.printf("%s%s",output.remove(0),p.getKey()).println();
                });



    }
}
