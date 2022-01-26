package StudentV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();
        while (!input.equals("end")) {
            String[] info = input.split("\\s+");
            String firstName = info[0];
            String lastName = info[1];
            int age = Integer.parseInt(info[2]);
            String city = info[3];

            if (isStudentInList(studentList, firstName, lastName)) {
                Student student = getExistingStudent(studentList, firstName, lastName);
                student.setAge(age);
                student.setTown(city);

            } else {
                Student student = new Student(firstName, lastName, age, city);
                studentList.add(student);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (Student student : studentList) {
            if (city.equals(student.getTown())) {
                System.out.println(student);
            }
        }


    }

    private static Student getExistingStudent(List<Student> studentList, String firstName, String lastName) {
        Student student = null;
        for (Student s : studentList) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                student = s;
            }
        }
        return student;
    }

    private static boolean isStudentInList(List<Student> studentList, String firstName, String lastName) {
        for (Student s : studentList) {
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
