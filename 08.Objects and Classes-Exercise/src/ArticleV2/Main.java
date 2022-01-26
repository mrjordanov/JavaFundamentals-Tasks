package ArticleV2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split(", ");

        String title = info[0];
        String content = info[1];
        String author = info[2];
        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String arg = scanner.nextLine();
            String[] command = arg.split(": ");
            if (command[0].equals("Edit")) {
                article.edit(command[1]);
            }
            if (command[0].equals("ChangeAuthor")) {
                article.changeAuthor(command[1]);
            }
            if (command[0].equals("Rename")) {
                article.rename(command[1]);
            }
        }
        System.out.println(article);
    }


}
