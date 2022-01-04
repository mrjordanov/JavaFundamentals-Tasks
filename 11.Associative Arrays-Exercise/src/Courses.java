import java.util.*;
import java.util.stream.Collectors;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> course = new LinkedHashMap<>();


        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String courseName=tokens[0];
            String studentName=tokens[1];

            course.putIfAbsent(courseName,new ArrayList<>());
           // List <String> students=course.get(courseName);
            //students.add(studentName); това е равносилно на долния ред!!!
           course.get(courseName).add(studentName);
            input = scanner.nextLine();
        }

         course.entrySet()
                .stream()
                .sorted((c1,c2)->Integer.compare(c2.getValue().size(),c1.getValue().size()))
                //до тук сме дали да се сортира спрямо броя на студентите в курса c1 и c2 по низходящ ред
                .forEach(entry-> {
                    System.out.println(String.format("%s: %d",entry.getKey(),entry.getValue().size()));
                    entry
                            .getValue()
                            .stream()
                            .sorted((s1,s2)->s1.compareTo(s2))
                            .forEach(s-> System.out.println(String.format("-- %s", s)));
                });//втората част казва студентите s1,s2 да бъдат сортирани по азбучен ред!
    }
}
