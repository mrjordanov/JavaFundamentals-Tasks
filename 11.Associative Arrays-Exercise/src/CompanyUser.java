import java.util.*;

public class CompanyUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String information = scanner.nextLine();

        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        while (!information.equals("End")) {
            String companyName = information.split("->")[0];
            String employee = information.split("->")[1];

            companyMap.putIfAbsent(companyName, new ArrayList<>());
            if (!companyMap.get(companyName).contains(employee)) {
                companyMap.get(companyName).add(employee);
            }

            information = scanner.nextLine();
        }

        companyMap.entrySet().stream().sorted((s1,s2)-> s1.getKey().compareTo(s2.getKey()))
                .forEach(c->{
                    System.out.printf("%s",c.getKey()).println();
                    c.getValue().stream().forEach(u-> System.out.printf("-- %s",u).println());
                });


    }
}
