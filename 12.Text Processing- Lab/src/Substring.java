import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String remove= scanner.nextLine();
        String input= scanner.nextLine();

        int indexOfRemove=input.indexOf(remove);
        while (indexOfRemove>=0){
              input=input.substring(0,indexOfRemove)+input.substring(indexOfRemove+remove.length());

            indexOfRemove=input.indexOf(remove);
        }
        System.out.print(input);
    }
}
