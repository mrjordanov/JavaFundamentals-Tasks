import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String[] parts=input.split(" ");

        Map<Double,Integer> occurrences = new TreeMap<>();
        for (String part: parts) {
            double curNum= Double.parseDouble(part);
            if(occurrences.containsKey(curNum)){
                Integer currentCount=occurrences.get(curNum);
                occurrences.put(curNum,currentCount+1);
            }
            else {
                occurrences.put(curNum,1);
            }
        }

        DecimalFormat decimalFormat=new DecimalFormat("#.#######");

        for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {

            System.out.printf("%s -> %d\n",
                    decimalFormat.format(entry.getKey()),entry.getValue());
        }
    }
}
