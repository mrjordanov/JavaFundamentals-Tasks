import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade=Double.parseDouble(scanner.nextLine());

        printGrade(grade);
    }

    public static void printGrade(double grade) {
        String result="";
        if (grade>=2 && grade<=2.99) {
            result="Fail";
        }
        else if (grade>=3 && grade<=3.49) {
            result="Poor";
        }
        else if (grade>3.49 && grade<=4.49) {
            result="Good";
        }
        else if (grade>4.49 && grade<=5.49) {
            result="Very good";
        }
        else {
            result="Excellent";
        }

        System.out.println(result);
    }

}
