import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");
        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String wordInLowerCase = strings[i].toLowerCase();
            if (occurrences.containsKey(wordInLowerCase)) {
                occurrences.put(wordInLowerCase, occurrences.get(wordInLowerCase) + 1);
            } else {
                occurrences.put(wordInLowerCase, 1);
            }
        }
        String res="";
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue()%2==1){
                res+= entry.getKey()+", ";
            }
        }
        System.out.printf("%s",res.substring(0, res.length()-2));


      //  ArrayList<String> odds = new ArrayList<>();
      //  for (var entry : occurrences.entrySet()) {
         //   if (entry.getValue() % 2 == 1) {
          //      odds.add(entry.getKey());
          //  }
       // }

       // for (int i = 0; i < odds.size() ; i++) {
          //  if (i== odds.size()-1){
            //    System.out.printf("%s",odds.get(i));
           // }
           // else {
           //     System.out.printf("%s, ", odds.get(i));
          //  }
       // }
    }
}
