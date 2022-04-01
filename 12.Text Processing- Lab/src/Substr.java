import java.util.Scanner;

public class Substr {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String input= scanner.nextLine();
          String text= scanner.nextLine();


          while(text.contains(input)){
              text=text.replace(input,"");
          }

        System.out.println(text);


    }
}
