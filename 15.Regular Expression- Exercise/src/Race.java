import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> participants = Arrays.stream(input.split(", ")).collect(Collectors.toList());
        String lettersRegex="[A-Za-z]";
        String digitRegex = "\\d";
        Pattern letter = Pattern.compile(lettersRegex);
        Pattern digits = Pattern.compile(digitRegex);
        Map<String, Integer> race=new LinkedHashMap<>();

        String info = scanner.nextLine();
        while (!info.equals("end of race")) {
            StringBuilder sb= new StringBuilder();
            Matcher matcherName = letter.matcher(info);
            Matcher matcherDigit = digits.matcher(info);

            while(matcherName.find()){
                sb.append(matcherName.group());
            }
            if (participants.contains(sb.toString())){
                race.putIfAbsent(sb.toString(),0);
                int km= race.get(sb.toString());
                while (matcherDigit.find()){
                   km+=Integer.parseInt(matcherDigit.group());
                }
                race.put(sb.toString(),km);
            }
            info = scanner.nextLine();
        }

        race.entrySet().stream().sorted((r1,r2)->r2.getValue().compareTo(r1.getValue())).limit(3).forEach(
                r-> {
                  //  System.out.println(+r.getKey());
                });

    }
}
