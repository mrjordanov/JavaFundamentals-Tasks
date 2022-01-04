import java.util.*;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] personalInfo = scanner.nextLine().split(" ");
            String name = personalInfo[0];
            int age = Integer.parseInt(personalInfo[1]);
            Person person = new Person(name, age);

            if (person.getAge()>30){
                people.add(person);
            }
        }

           // people.stream().sorted((p1,p2)->Integer.compare(p1.getAge(), p2.getAge())) stream sort по години!
        people.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(p-> System.out.println(p.getName()+" - "+p.getAge()));

    }
}
