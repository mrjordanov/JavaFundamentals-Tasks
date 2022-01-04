import javax.sound.midi.Soundbank;
import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> company= new LinkedHashMap<>();
        String input= scanner.nextLine();

        while(!input.equals("End")){
            String[] line=input.split(" -> ");
            String companyName=line[0];
            String employee= line[1];

            company.putIfAbsent(companyName, new ArrayList<>());
            List <String >list=company.get(companyName);
            if (!list.contains(employee)){
                list.add(employee);
            }
            input= scanner.nextLine();
        }

        company.entrySet()
                .stream()
                .sorted((c1,c2)-> c1.getKey().compareTo(c2.getKey()))
                .forEach(i-> {
                    System.out.println(String.format("%s",i.getKey()));
                    i
                            .getValue()
                            .forEach(s-> System.out.println(String.format("-- %s",s)));
                        });
        System.out.println();
        System.out.println();
        company.entrySet()
                .stream()
                .sorted((c1,c2)-> c1.getKey().compareTo(c2.getKey()))
                .forEach(c-> {
                    System.out.println(c.getKey());
                    c.getValue()
                            .forEach(course-> System.out.println(String.format("-- %s", course)));
                });
    }
}
