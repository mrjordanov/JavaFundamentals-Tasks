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
                .forEach(entry-> {
                    System.out.println(String.format("%s: %d",entry.getKey(),entry.getValue().size()));
                    entry
                            .getValue()
                            .forEach(s-> System.out.println(String.format("-- %s", s)));
                });//втората част казва студентите s1,s2 да бъдат сортирани по азбучен ред!
    }
}
