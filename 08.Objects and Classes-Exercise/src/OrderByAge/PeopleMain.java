package OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<People> information = new ArrayList<>();
        while (!input.equals("End")) {
            String[] info = input.split(" ");
            String name = info[0];
            String id = info[1];
            int age = Integer.parseInt(info[2]);

            People people = new People(name, id, age);
            information.add(people);
            input = scanner.nextLine();
        }


        information.stream().sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge())).
                forEach(s -> System.out.println(s));


    }
}
