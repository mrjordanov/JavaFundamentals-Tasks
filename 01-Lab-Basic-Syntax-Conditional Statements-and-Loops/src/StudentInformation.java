import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name= scanner.nextLine();
        int age= Integer.parseInt(scanner.nextLine());
        double avvGrade= Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,avvGrade);



    }
}