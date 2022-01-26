package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Student> information = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] arg = scanner.nextLine().split(" ");
            String firstName = arg[0];
            String secondName = arg[1];
            double grade = Double.parseDouble(arg[2]);

            Student student = new Student(firstName, secondName, grade);

            information.add(student);
        }


        information.stream().sorted((s2, s1) -> Double.compare(s1.getGrade(), s2.getGrade())).
                forEach(s -> System.out.printf("%s %s: %.2f", s.getFirstName(), s.getSecondName(), s.getGrade()).println());

    }
}
