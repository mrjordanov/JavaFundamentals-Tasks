import java.util.Scanner;

public class Extract {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String input= scanner.nextLine();

        int index = input.lastIndexOf("\\");
        String fileAndExtension= input.substring(index+1);
        String[] arr=fileAndExtension.split("\\.");
        System.out.printf("File name: %s",arr[0]).println();
        System.out.printf("File extension: %s",arr[1]).println();

    }
}
