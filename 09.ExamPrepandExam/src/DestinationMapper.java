import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String expression="(\\=|\\/)(?<loc>[A-Z][A-Z-a-z][A-Za-z]+)\\1";

        Pattern regex= Pattern.compile(expression);
        Matcher matcher=regex.matcher(input);
        boolean isFound=false;
        int sum=0;
        String last="";
            while (matcher.find()){
                String valid= matcher.group("loc");
                sum+= valid.length();
                last+=valid+", ";
                isFound=true;
            }

            if (isFound){
                System.out.printf("Destinations: %s",last.substring(0,last.length()-2)).println();
                System.out.printf("Travel Points: %d",sum).println();
            }
            else {
                System.out.println("Destinations:");
                System.out.println("Travel Points: 0");
            }

    }
}
