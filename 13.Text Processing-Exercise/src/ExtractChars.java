import java.util.Scanner;

public class ExtractChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
       // String[] arr= input.split("[\\]");

        int lastIndexOfSplash=input.lastIndexOf('\\');
        int lastIndexOfDot=input.lastIndexOf('.');
        String fileName=input.substring(lastIndexOfSplash+1,lastIndexOfDot);
        String extension=input.substring(lastIndexOfDot+1);

        System.out.printf("File name: %s",fileName).println();
        System.out.printf("File extension: %s",extension);

    }
}
