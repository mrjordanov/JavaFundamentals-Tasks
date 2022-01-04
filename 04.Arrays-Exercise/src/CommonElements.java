import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input= scanner.nextLine();
        String name= scanner.nextLine();
        String[] one=input.split(" ");
        String[] two= name.split(" ");

        for (int i = 0; i < two.length ; i++) {
            for (int j = 0; j < one.length ; j++) {
                if (two[i].equals(one[j])) {
                    System.out.printf("%s ",two[i]);
                }
            }


        }



    }
}
