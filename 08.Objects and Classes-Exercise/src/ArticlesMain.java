import java.util.Scanner;

public class ArticlesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleData = scanner.nextLine().split(", ");
        String initialTitle = articleData[0];
        String initialContent = articleData[1];
        String initialAuthor = articleData[2];

        Articles article = new Articles(initialTitle, initialContent, initialAuthor);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens=input.split(": ");
            String command=tokens[0];
            String data= tokens[1];
            switch (command){
                case "Edit":
                    //article.edit(data);
                    article.setContent(data);
                    break;
                case "ChangeAuthor":
                   // article.changeAuthor(data);
                    article.setAuthor(data);
                    break;
                case "Rename":
                   // article.renameTitle(data);
                    article.setTitle(data);
                    break;
            }
        }
        System.out.println(article);
    }
}
